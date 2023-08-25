public class Main {
    public static void main(String[] args) {

        LeagueSystem leagueSystem = new LeagueSystem();

        Team team1 = new Team("Team A");
        Team team2 = new Team("Team B");

        Player player1 = new Player("ahmed",1,team1,20,15,"st");
        Player player2 = new Player("Player 2", 7, team1, 28,30, "midfielder");
        Player player3 = new Player("Player 3", 1, team2,22 ,22, "goalkeeper");

/*        leagueSystem.addTeam(team1);
        leagueSystem.addTeam(team2);

        leagueSystem.addPlayer(player1);
        leagueSystem.addPlayer(player2);
        leagueSystem.addPlayer(player3);

        leagueSystem.addMatch(match);*/

/*         Display team and player information
        leagueSystem.displayTeamsByPoints();
        leagueSystem.displayTopScorers(3);
        leagueSystem.displayTopGoalkeepers(2);
        leagueSystem.displayTopRankedPlayers(4);
        leagueSystem.displayTeamsByGoals();
        leagueSystem.displayTeamsByAverageAge();
        leagueSystem.displayMatchesOnDate(matchDate);*/
    }
}