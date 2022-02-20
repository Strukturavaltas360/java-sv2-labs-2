package activitytrackerjdbctemplate;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.*;
import java.util.List;

public class TrackPointDao {
    JdbcTemplate jdbcTemplate;

    public TrackPointDao(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public TrackPointDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void saveTrackPoints(List<TrackPoint> trackPoints, long activities_id) {
        String insert = "INSERT INTO track_point (`time`, lat, lon, activities_id) VALUES (?, ?, ?, ?)";
        for (TrackPoint trackPoint: trackPoints) {
            validateTrackPoint(trackPoint);
            jdbcTemplate.update(insert,
                    Date.valueOf(trackPoint.getTime()),
                    trackPoint.getLat(),
                    trackPoint.getLon(),
                    activities_id);
        }
    }

    private void validateTrackPoint(TrackPoint trackPoint) {
        if (Math.abs(trackPoint.getLat()) > 90 || Math.abs(trackPoint.getLon()) > 180) {
            throw new IllegalArgumentException("Invalid coordinate!");
        }
    }

    public List<TrackPoint> listTrackPoints(long activities_id) throws SQLException {
        String query = "SELECT * FROM track_point WHERE activities_id=? ORDER BY id";
        return jdbcTemplate.query(query, (rs, rowNum) -> readTrackPoint(rs), activities_id);
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
