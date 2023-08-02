import java.util.ArrayList;
import java.util.List;

public class FixtureGenerator {


    private List<String> teams;
    private List<String> fixture;

    public FixtureGenerator(List<String> teams) {
        this.teams = teams;
        this.fixture = new ArrayList<>();
        generateFixture();
    }

    public void generateFixture() {
        int numTeams = teams.size();
        if (numTeams % 2 != 0) {
            teams.add("Bay"); // If the number of teams is odd, add a "Bay" team.
            numTeams++;
        }

        int numRounds = numTeams - 1;
        int numMatchesPerRound = numTeams / 2;

        for (int round = 1; round <= numRounds; round++) {
            StringBuilder roundMatches = new StringBuilder();

            for (int match = 0; match < numMatchesPerRound; match++) {
                int homeTeamIndex = (round + match) % (numTeams - 1);
                int awayTeamIndex = (numTeams - 1 - match + round) % (numTeams - 1);

                if (match == 0) {
                    // If it's the first match of the round, the "Bay" team will play.
                    awayTeamIndex = numTeams - 1;
                }

                String homeTeam = teams.get(homeTeamIndex);
                String awayTeam = teams.get(awayTeamIndex);

                String matchPair = homeTeam + " vs " + awayTeam;
                roundMatches.append(matchPair).append(" ");

            }
            fixture.add("Round " + round + "\n" + roundMatches);
        }
    }

    public List<String> getFixture() {
        return fixture;
    }
}

