package nestedclasses.soccer;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ChampionshipTest {
    Championship championship = new Championship();

    @Test
    void addGameTest() {
        championship.addGame(championship.new GameResult(
                "team1", "team2", 1, 1));
        championship.addGame(championship.new GameResult(
                "team3", "team4", 2, 1));
        championship.addGame(championship.new GameResult(
                "team2", "team1", 3, 0));
        championship.addGame(championship.new GameResult(
                "team4", "team3", 4, 3));
        List<TeamStatistics> tabelle = championship.getLeagueTable();
        assertEquals(4, tabelle.size());
        TeamStatistics teamStatistics1 = tabelle.get(tabelle.indexOf(new TeamStatistics("team1")));
        assertEquals("team1", teamStatistics1.getName());
        assertEquals(1, teamStatistics1.getPoints());
        TeamStatistics teamStatistics2 = tabelle.get(tabelle.indexOf(new TeamStatistics("team2")));
        assertEquals(4, teamStatistics2.getPoints());
    }
}