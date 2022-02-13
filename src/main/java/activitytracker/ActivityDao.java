package activitytracker;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ActivityDao {
    private DataSource dataSource;

    public ActivityDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Activity saveActivity(Activity activity) {
        String insert = "INSERT INTO activities (id, start_time, activity_desc, activity_type) VALUES (?,?,?,?)";
        try (Connection connection = dataSource.getConnection();
             PreparedStatement ps = connection.prepareStatement(insert, Statement.RETURN_GENERATED_KEYS)) {
            ps.setLong(1, activity.getId());
            ps.setTimestamp(2, Timestamp.valueOf(activity.getStartTime()));
            ps.setString(3, activity.getDesc());
            ps.setString(4, activity.getType().name());
            ps.executeUpdate();
            return findActivityById(getGeneratedKey(ps));
        } catch (SQLException sqle) {
            throw new IllegalStateException("SQL error", sqle);
        }
    }

    private long getGeneratedKey(PreparedStatement ps) throws SQLException {
        try (ResultSet rs = ps.getGeneratedKeys()) {
            if (rs.next()) {
                return rs.getLong("id");
            } else {
                throw new IllegalStateException("Can not get key after insert!");
            }
        }
    }

    public Activity findActivityById(long id) {
        String query = "SELECT * FROM activities WHERE id=?";
        try (Connection connection = dataSource.getConnection();
             PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setLong(1, id);
            return getActivityFromPs(ps);
        } catch (SQLException sqle) {
            throw new IllegalStateException("SQL error", sqle);
        }
    }

    public List<Activity> listActivities() {
        String query = "SELECT * FROM activities ORDER BY id";
        List<Activity> result = new ArrayList<>();
        try (Connection connection = dataSource.getConnection();
             Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                result.add(readActivity(rs));
            }
        } catch (SQLException sqle) {
            throw new IllegalStateException("SQL error", sqle);
        }
        return result;
    }

    private Activity getActivityFromPs(PreparedStatement ps) throws SQLException {
        try (ResultSet rs = ps.executeQuery()) {
            if (rs.next()) {
                return readActivity(rs);
            } else {
                throw new IllegalArgumentException("There is no such activity!");
            }
        }
    }

    private Activity readActivity(ResultSet rs) throws SQLException {
        return new Activity(
                rs.getInt("id"),
                rs.getTimestamp("start_time").toLocalDateTime(),
                rs.getString("activity_desc"),
                Type.valueOf(rs.getString("activity_type")));
    }
}
