package activitytracker;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

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

}