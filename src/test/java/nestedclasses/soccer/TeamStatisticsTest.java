package nestedclasses.soccer;

import nestedclasses.soccer.TeamStatistics;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeamStatisticsTest {
    TeamStatistics teamStatistics = new TeamStatistics("team");

    @BeforeEach
    void init() {
        teamStatistics.played(1,1);
        teamStatistics.played(2,4);
        teamStatistics.played(6,0);
    }

    @Test
    void getDetails() {
        TeamStatistics.Details details = teamStatistics.getDetails();
        assertEquals(3, details.getPlayed());
        assertEquals(1, details.getWon());
        assertEquals(1, details.getTied());
        assertEquals(1, details.getLost());
        assertEquals(9, details.getGoalsFor());
        assertEquals(5, details.getGoalsAgainst());
    }

    @Test
    void getPoints() {
        assertEquals(4, teamStatistics.getPoints());
    }
}