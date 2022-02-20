package activitytrackerjdbctemplate;

import org.flywaydb.core.Flyway;
import org.mariadb.jdbc.MariaDbDataSource;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDateTime;

public class ActivityTrackerMain {
    public static void main(String[] args) {
        ActivityTrackerMain main = new ActivityTrackerMain();
        DataSource dataSource = main.getDataSource();
        Flyway flyway = Flyway.configure().dataSource(dataSource).load();
        flyway.clean();
        flyway.migrate();
        main.insertData(dataSource);
        System.out.println(new ActivityDao(dataSource).listActivities());
    }

    private void insertData(DataSource dataSource) {
        Activity activity1 = new Activity(1, LocalDateTime.of(2022, 01, 01, 9, 30),
                "Újévi futás", Type.RUNNING);
        Activity activity2 = new Activity(2, LocalDateTime.of(2022, 01, 01, 14, 0),
                "Kosármeccs", Type.BASKETBALL);
        Activity activity3 = new Activity(3, LocalDateTime.of(2022, 01, 03, 7, 30),
                "Munkába kerékpározás", Type.BIKING);
        Activity activity4 = new Activity(4, LocalDateTime.of(2022, 01, 03, 16, 10),
                "Munkából kerékpározás", Type.BIKING);
        ActivityDao activityDao = new ActivityDao(dataSource);
        activityDao.saveActivity(activity1);
        activityDao.saveActivity(activity2);
        activityDao.saveActivity(activity3);
        activityDao.saveActivity(activity4);
    }

    private DataSource getDataSource() {
        try {
            MariaDbDataSource dataSource = new MariaDbDataSource(
                    "jdbc:mariadb://localhost:3306/activitytracker");
            dataSource.setUser("activitytracker");
            dataSource.setPassword("activitytracker");
            return dataSource;
        } catch (SQLException sqle) {
            throw new IllegalStateException("SQL error", sqle);
        }
    }
}
