package activitytrackerjdbctemplate;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.*;
import java.util.List;

public class ActivityDao {
    private JdbcTemplate jdbcTemplate;

    public ActivityDao(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void saveActivity(Activity activity) {
        jdbcTemplate.update("INSERT INTO activities (id, start_time, activity_desc, activity_type) VALUES (?,?,?,?)",
                activity.getId(), activity.getStartTime(), activity.getDesc(), activity.getType().name());
    }

    public Activity findActivityById(long id) {
        String query = "SELECT * FROM activities WHERE id=?";
        return jdbcTemplate.queryForObject(query, (rs, rowNum) -> readActivity(rs), id);
    }

    public List<Activity> listActivities() {
        String query = "SELECT * FROM activities";
        return jdbcTemplate.query(query, (rs, rowNum) -> readActivity(rs));
    }

    private Activity readActivity(ResultSet rs) throws SQLException {
        return new Activity(
                rs.getInt("id"),
                rs.getTimestamp("start_time").toLocalDateTime(),
                rs.getString("activity_desc"),
                Type.valueOf(rs.getString("activity_type")));
    }
}
