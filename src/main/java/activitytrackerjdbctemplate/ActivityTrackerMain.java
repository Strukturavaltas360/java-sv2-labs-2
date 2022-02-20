package activitytrackerjdbctemplate;

import org.mariadb.jdbc.MariaDbDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.List;

public class ActivityTrackerMain {
    public static void main(String[] args) {
        ActivityTrackerMain main = new ActivityTrackerMain();
        DataSource dataSource = main.getDataSource();
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        System.out.println(main.getActivityById(jdbcTemplate, 2));
        List<Activity> activities = main.getActivities(jdbcTemplate);
        System.out.println(activities);
    }

    private List<Activity> getActivities(JdbcTemplate jdbcTemplate) {
        String query = "SELECT * FROM activities";
        return jdbcTemplate.query(query, (rs, rowNum) -> readActivity(rs));
    }

    private Activity getActivityById(JdbcTemplate jdbcTemplate, int id) {
        String query = "SELECT * FROM activities WHERE id=?";
        return jdbcTemplate.queryForObject(query, (rs, rowNum) -> readActivity(rs), id);
    }

    private Activity readActivity(ResultSet rs) throws SQLException {
        return new Activity(
                rs.getInt("id"),
                rs.getTimestamp("start_time").toLocalDateTime(),
                rs.getString("activity_desc"),
                Type.valueOf(rs.getString("activity_type")));
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
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        saveActivity(jdbcTemplate, activity1);
        saveActivity(jdbcTemplate, activity2);
        saveActivity(jdbcTemplate, activity3);
        saveActivity(jdbcTemplate, activity4);
    }

    private void saveActivity(JdbcTemplate jdbcTemplate, Activity activity) {
        jdbcTemplate.update("INSERT INTO activities (start_time, activity_desc, activity_type) VALUES (?,?,?)",
                activity.getStartTime(), activity.getDesc(), activity.getType().name());
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
