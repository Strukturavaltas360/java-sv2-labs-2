package activitytrackerjdbctemplate;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import javax.sql.DataSource;
import java.sql.*;
import java.util.List;

public class ActivityDao {
    private JdbcTemplate jdbcTemplate;

    public ActivityDao(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public Activity saveActivity(Activity activity) {
        String query = "INSERT INTO activities (id, start_time, activity_desc, activity_type) VALUES (?,?,?,?)";
        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(connection -> prepareStatementReturnGeneratedKeys(connection, query, activity), keyHolder);
        return findActivityById(keyHolder.getKey().longValue());
    }

    private PreparedStatement prepareStatementReturnGeneratedKeys(
            Connection connection, String query, Activity activity) throws SQLException {
        PreparedStatement ps = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
        ps.setLong(1, activity.getId());
        ps.setTimestamp(2, Timestamp.valueOf(activity.getStartTime()));
        ps.setString(3, activity.getDesc());
        ps.setString(4, activity.getType().name());
        return ps;
    }

    public Activity findActivityById(long id) {
        String query = "SELECT * FROM activities WHERE id=?";
        return jdbcTemplate.queryForObject(query, (rs, rowNum) -> readActivity(rs), id);
    }

    public List<Activity> listActivities() {
        String query = "SELECT * FROM activities ORDER BY id";
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
