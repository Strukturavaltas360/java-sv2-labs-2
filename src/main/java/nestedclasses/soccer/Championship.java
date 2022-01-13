package nestedclasses.soccer;

import java.util.ArrayList;
import java.util.List;

public class Championship {
    public class GameResult {
        private String teamHome;
        private String teamGuest;
        private int goalHome;
        private int goalGuest;

        public GameResult(String teamHome, String teamGuest, int goalHome, int goalGuest) {
            this.teamHome = teamHome;
            this.teamGuest = teamGuest;
            this.goalHome = goalHome;
            this.goalGuest = goalGuest;
        }
    }

    private List<TeamStatistics> leagueTable = new ArrayList<>();

    public void addGame(GameResult result) {
        addResult(result.teamHome, result.goalHome, result.goalGuest);
        addResult(result.teamGuest, result.goalGuest, result.goalHome);
    }

    private void addResult(String team, int goalsFor, int goalsAgainst) {
        TeamStatistics teamStatistics = findTeamStatistics(team);
        teamStatistics.played(goalsFor, goalsAgainst);
    }

    private TeamStatistics findTeamStatistics(String team) {
        TeamStatistics teamStatistics;
        TeamStatistics teamToSearch = new TeamStatistics(team);
        if (leagueTable.contains(teamToSearch)) {
            teamStatistics = leagueTable.get(leagueTable.indexOf(teamToSearch));
        } else {
            teamStatistics = new TeamStatistics(team);
            leagueTable.add(teamStatistics);
        }
        return teamStatistics;
    }

    public List<TeamStatistics> getLeagueTable() {
        return leagueTable;
    }
}
