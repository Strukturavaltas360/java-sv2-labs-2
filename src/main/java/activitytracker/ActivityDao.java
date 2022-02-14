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
            return saveActivity(connection, ps, activity);
        } catch (SQLException sqle) {
            throw new IllegalStateException("SQL error", sqle);
        }
    }

    private Activity saveActivity(Connection connection, PreparedStatement ps, Activity activity) throws SQLException {
        connection.setAutoCommit(false);
        setPsForActivitySave(ps, activity);
        ps.executeUpdate();
        activity.setId(getGeneratedKey(ps));
        try {
            saveTrackPoints(connection, activity);
            connection.commit();
        } catch (SQLException | IllegalArgumentException exception) {
            connection.rollback();
            throw exception;
        }
        return findActivityById(activity.getId());
    }

    private void saveTrackPoints(Connection connection, Activity activity) throws SQLException {
        if (activity.getTrackPoints() != null) {
            new TrackPointDao(connection).saveTrackPoints(activity.getTrackPoints(), activity.getId());
        }
    }

    private void setPsForActivitySave(PreparedStatement ps, Activity activity) throws SQLException {
        ps.setLong(1, activity.getId());
        ps.setTimestamp(2, Timestamp.valueOf(activity.getStartTime()));
        ps.setString(3, activity.getDesc());
        ps.setString(4, activity.getType().name());
    }

    private long getGeneratedKey(PreparedStatement ps) throws SQLException {
        try (ResultSet rs = ps.getGeneratedKeys()) {
            if (rs.next()) {
                return rs.getLong(1);
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
            return getActivityFromPs(connection, ps);
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
                result.add(readActivity(connection, rs));
            }
        } catch (SQLException sqle) {
            throw new IllegalStateException("SQL error", sqle);
        }
        return result;
    }

    private Activity getActivityFromPs(Connection connection, PreparedStatement ps) throws SQLException {
        try (ResultSet rs = ps.executeQuery()) {
            if (rs.next()) {
                Activity activity = readActivity(connection, rs);
                return activity;
            } else {
                throw new IllegalArgumentException("There is no such activity!");
            }
        }
    }

    private Activity readActivity(Connection connection, ResultSet rs) throws SQLException {
        Activity activity = new Activity(
                rs.getInt("id"),
                rs.getTimestamp("start_time").toLocalDateTime(),
                rs.getString("activity_desc"),
                Type.valueOf(rs.getString("activity_type")));
        activity.setTrackPoints(new TrackPointDao(connection).listTrackPoints(activity.getId()));
        return activity;
    }
}
