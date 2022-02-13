package activitytracker;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TrackPointDao {
    Connection connection;

    public TrackPointDao(Connection connection) {
        this.connection = connection;
    }

    public void saveTrackPoints(List<TrackPoint> trackPoints, long activities_id) throws SQLException {
        String insert = "INSERT INTO track_point (`time`, lat, lon, activities_id) VALUES (?, ?, ?, ?)";
        try (PreparedStatement ps = connection.prepareStatement(insert)) {
            for (TrackPoint trackPoint: trackPoints) {
                validateTrackPoint(trackPoint);
                setPsForTrackPointSave(ps, trackPoint, activities_id);
                ps.executeUpdate();
            }
        }
    }

    private void validateTrackPoint(TrackPoint trackPoint) {
        if (Math.abs(trackPoint.getLat()) > 90 || Math.abs(trackPoint.getLon()) > 180) {
            throw new IllegalArgumentException("Invalid coordinate!");
        }
    }

    private void setPsForTrackPointSave(PreparedStatement ps, TrackPoint trackPoint, long activities_id) throws SQLException {
        ps.setDate(1, Date.valueOf(trackPoint.getTime()));
        ps.setDouble(2, trackPoint.getLat());
        ps.setDouble(3, trackPoint.getLon());
        ps.setLong(4, activities_id);
    }

    public List<TrackPoint> listTrackPoints(long activities_id) throws SQLException {
        String query = "SELECT * FROM track_point WHERE activities_id=? ORDER BY id";
        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setLong(1, activities_id);
            return queryTrackPoints(ps);
        }
    }

    private List<TrackPoint> queryTrackPoints(PreparedStatement ps) throws SQLException {
        List<TrackPoint> result = new ArrayList<>();
        try (ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                result.add(readTrackPoint(rs));
            }
        }
        return result;
    }

    private TrackPoint readTrackPoint(ResultSet rs) throws SQLException {
        TrackPoint trackPoint = new TrackPoint(
                rs.getDate("time").toLocalDate(),
                rs.getDouble("lat"),
                rs.getDouble("lon"));
        trackPoint.setId(rs.getInt("id"));
        return trackPoint;
    }
}
