package activitytracker;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ActivityDaoTest {
    MariaDbDataSource dataSource;
    ActivityDao activityDao;

    Activity activity1 = new Activity(1, LocalDateTime.of(2022, 01, 01, 9, 30),
            "Újévi futás", Type.RUNNING);
    Activity activity2 = new Activity(2, LocalDateTime.of(2022, 01, 01, 14, 0),
            "Kosármeccs", Type.BASKETBALL);
    Activity activity3 = new Activity(3, LocalDateTime.of(2022, 01, 03, 7, 30),
            "Munkába kerékpározás", Type.BIKING);
    Activity activity4 = new Activity(4, LocalDateTime.of(2022, 01, 03, 16, 10),
            "Munkából kerékpározás", Type.BIKING);

    List<TrackPoint> trackPoints1 = List.of(
            new TrackPoint(LocalDate.now().minusDays(1), 18.5, 47.0),
            new TrackPoint(LocalDate.now().minusDays(1), 18.6, 47.1),
            new TrackPoint(LocalDate.now().minusDays(1), 18.7, 47.2));

    List<TrackPoint> trackPoints2 = List.of(
            new TrackPoint(LocalDate.now(), 19.5, 47.0),
            new TrackPoint(LocalDate.now(), 19.6, 47.1),
            new TrackPoint(LocalDate.now(), 19.7, 47.2));

    List<TrackPoint> trackPointsInvalid = List.of(
            new TrackPoint(LocalDate.now(), 19.5, 47.0),
            new TrackPoint(LocalDate.now(), 19.6, 47.1),
            new TrackPoint(LocalDate.now(), 19.7, 200.0));

    @BeforeEach
    void init() throws SQLException {
        dataSource = new MariaDbDataSource(
                "jdbc:mariadb://localhost:3306/activitytracker");
        dataSource.setUser("activitytracker");
        dataSource.setPassword("activitytracker");

        Flyway flyway = Flyway.configure().dataSource(dataSource).load();
        flyway.clean();
        flyway.migrate();

        activityDao = new ActivityDao(dataSource);
        activity3.setTrackPoints(trackPoints1);
        activity4.setTrackPoints(trackPoints2);
    }

    @Test
    void saveAndListAndFindTest() {
        activityDao.saveActivity(activity4);
        activityDao.saveActivity(activity2);
        activityDao.saveActivity(activity3);
        activityDao.saveActivity(activity1);

        List<Activity> expected = List.of(activity1, activity2, activity3, activity4);
        List<Activity> activities = activityDao.listActivities();
        assertEquals(expected, activities);

        assertEquals(activity3, activityDao.findActivityById(3));
    }

    @Test
    void saveActivity() {
        activityDao.saveActivity(activity4);
        activityDao.saveActivity(activity2);
        activityDao.saveActivity(activity3);
        LocalDateTime startTime = LocalDateTime.of(2022, 1, 30, 11, 34, 10);
        Activity actual = activityDao.saveActivity(new Activity(0, startTime, "test", Type.RUNNING));
        assertEquals(5, actual.getId());
        assertEquals(startTime, actual.getStartTime());
        assertEquals("test", actual.getDesc());
        assertEquals(Type.RUNNING, actual.getType());

        Activity expected = activityDao.findActivityById(5);
        assertEquals(expected, actual);
    }

    @Test
    void saveWithTrackPointsAndFindTest() {
        activityDao.saveActivity(activity4);

        Activity activity = activityDao.findActivityById(4);
        List<TrackPoint> actual = activity.getTrackPoints().stream()
                .map(trackPoint -> new TrackPoint(trackPoint.getTime(), trackPoint.getLat(), trackPoint.getLon()))
                .collect(Collectors.toList());

        assertEquals(activity4.getTrackPoints(), actual);
    }

    @Test
    void saveActivityRollback() {
        activity1.setTrackPoints(trackPointsInvalid);
        assertThrows(IllegalArgumentException.class, () -> activityDao.saveActivity(activity1));

        List<Activity> activities = activityDao.listActivities();
        assertEquals(0, activities.size());
    }
}