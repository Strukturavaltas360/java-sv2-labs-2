package defaultconstructor.chess;

import java.util.ArrayList;
import java.util.List;

public class ChessTournament {
    private List<Team> teams = new ArrayList<>();

    public ChessTournament() {
        for (int i = 0; i < 3 ; i++) {
            teams.add(new Team());
        }
    }

    public void addPlayersToTeams(List<Player> playersRegistrated) {
        int nextPlayer = 0;
        for (int i = 0; i < 3 ; i++) {
            Player player1 = null;
            Player player2 = null;
            if (nextPlayer < playersRegistrated.size()) {
                player1 = playersRegistrated.get(nextPlayer++);
            }
            if (nextPlayer < playersRegistrated.size()) {
                player2 = playersRegistrated.get(nextPlayer++);
            }
            teams.get(i).setPlayerOne(player1);
            teams.get(i).setPlayerTwo(player2);
        }
    }

    public List<Team> getTeams() {
        return teams;
    }
}
