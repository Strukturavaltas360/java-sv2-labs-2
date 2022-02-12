package activitytracker;

import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.*;
import java.time.LocalDateTime;

public class ActivityTrackerMain {
    public static void main(String[] args) {
        ActivityTrackerMain main = new ActivityTrackerMain();
        Activity activity1 = new Activity(1, LocalDateTime.of(2022, 01, 01, 9, 30),
                "Újévi futás", Type.RUNNING);
        Activity activity2 = new Activity(2, LocalDateTime.of(2022, 01, 01, 14, 0),
                "Kosármeccs", Type.BASKETBALL);
        Activity activity3 = new Activity(3, LocalDateTime.of(2022, 01, 03, 7, 30),
                "Munkába kerékpározás", Type.BIKING);
        Activity activity4 = new Activity(4, LocalDateTime.of(2022, 01, 03, 16, 10),
                "Munkából kerékpározás", Type.BIKING);
        try (Connection connection = main.getConnection()) {
            main.createActivitiesTable(connection);
            main.insertActivity(connection, activity1);
            main.insertActivity(connection, activity2);
            main.insertActivity(connection, activity3);
            main.insertActivity(connection, activity4);
        } catch (SQLException sqle) {
            throw new IllegalStateException("SQL error", sqle);
        }
    }

    private void insertActivity(Connection connection, Activity activity) throws SQLException {
        String insert = "INSERT INTO activities (id, start_time, activity_desc, activity_type) VALUES (?,?,?,?)";
        try (PreparedStatement ps = connection.prepareStatement(insert)) {
            ps.setInt(1, activity.getId());
            ps.setTimestamp(2, Timestamp.valueOf(activity.getStartTime()));
            ps.setString(3, activity.getDesc());
            ps.setString(4, activity.getType().name());
            ps.executeUpdate();
        }
    }

    private void createActivitiesTable(Connection connection) throws SQLException {
        try (Statement stmt = connection.createStatement()) {
            stmt.execute("CREATE TABLE IF NOT EXISTS activities \n" +
                    "(\n" +
                    "  id              INT auto_increment PRIMARY KEY,\n" +
                    "  start_time      TIMESTAMP,\n" +
                    "  activity_desc   VARCHAR(100),\n" +
                    "  activity_type   VARCHAR(10)\n" +
                    ");");
        }
    }

    private Connection getConnection() throws SQLException {
        MariaDbDataSource dataSource = new MariaDbDataSource("jdbc:mariadb://localhost:3306/activitytracker");
        dataSource.setUser("activitytracker");
        dataSource.setPassword("activitytracker");
        return dataSource.getConnection();
    }
}
