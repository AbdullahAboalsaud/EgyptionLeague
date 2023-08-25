import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeagueSystem {
    private List<Team> teams;
    private static List<Player> players;
    private List<Match> matches;

    public LeagueSystem() {
        teams = new ArrayList<>();
        players = new ArrayList<>();
        matches = new ArrayList<>();
    }


    public void main(String[] args) {

        Team team = new Team();
        Player p = new Player("assem", 7, team, 22, 0, "st");
        Player p1 = new Player("ali", 10, team, 20, 0, "rwf");


        players.add(p);
        players.add(p1);

        displayAllPlayers();
    }


    public void addPlayedMatch() {
    }

    private void displayStatistics() {

    }

    private void deleteTeam() {

    }

    public void addTeam() {

    }

    public void displayAllPlayers() {
        System.out.println("List of Players:");
        for (Player player : players) {
            System.out.println("Name: " + player.getName());
            System.out.println("Number: " + player.getNumber());
            System.out.println("Team: " + player.getTeam().getTeamName());
            System.out.println("Age: " + player.getAge());
            System.out.println("Score: " + player.getScore());
            System.out.println("Rank: " + player.getRank());
            System.out.println("Role: " + player.getRole());
            System.out.println("---------------------");
        }
    }


}
