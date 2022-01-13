package nestedclasses.soccer;

import java.util.Objects;

public class TeamStatistics {
    public class Details {
        private int played;
        private int won;
        private int tied;
        private int lost;
        private int goalsFor;
        private int goalsAgainst;

        private void addResult(int plusGoalsFor, int plusGoalsAgainst) {
            played++;
            if (plusGoalsFor == plusGoalsAgainst) {
                tied++;
            } else if (plusGoalsFor > plusGoalsAgainst) {
                won++;
            } else {
                lost++;
            }
            goalsFor += plusGoalsFor;
            goalsAgainst += plusGoalsAgainst;
        }

        private int calculatePoints() {
            return 3 * won + tied;
        }

        public int getPlayed() {
            return played;
        }

        public int getWon() {
            return won;
        }

        public int getTied() {
            return tied;
        }

        public int getLost() {
            return lost;
        }

        public int getGoalsFor() {
            return goalsFor;
        }

        public int getGoalsAgainst() {
            return goalsAgainst;
        }
    }

    private String name;
    private Details details = new Details();
    private int points;

    public TeamStatistics(String name) {
        this.name = name;
    }

    public void played(int plusGoalsFor, int plusGoalsAgainst) {
        details.addResult(plusGoalsFor, plusGoalsAgainst);
        points = details.calculatePoints();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TeamStatistics that = (TeamStatistics) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String getName() {
        return name;
    }

    public Details getDetails() {
        return details;
    }

    public int getPoints() {
        return points;
    }
}
