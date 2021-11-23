package defaultconstructor.chess;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ChessTournamentTest {

    @Test
    void addPlayersToTeams() {
        List<Player> players = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Player player = new Player();
            player.setName(String.format("%d. player", i));
            player.setEmail(String.format("player%d@gmail.com", i));
            players.add(player);
        }

        ChessTournament chessTournament = new ChessTournament();
        chessTournament.addPlayersToTeams(players);

        assertEquals("0. player", chessTournament.getTeams().get(0).getPlayerOne().getName());
        assertEquals("5. player", chessTournament.getTeams().get(2).getPlayerTwo().getName());
    }

    @Test
    void addPlayersToTeamsPartly() {
        List<Player> players = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            Player player = new Player();
            player.setName(String.format("%d. player", i));
            player.setEmail(String.format("player%d@gmail.com", i));
            players.add(player);
        }

        ChessTournament chessTournament = new ChessTournament();
        chessTournament.addPlayersToTeams(players);

        assertEquals("0. player", chessTournament.getTeams().get(0).getPlayerOne().getName());
        assertEquals("2. player", chessTournament.getTeams().get(1).getPlayerOne().getName());
        assertNull(chessTournament.getTeams().get(2).getPlayerTwo());
    }
}