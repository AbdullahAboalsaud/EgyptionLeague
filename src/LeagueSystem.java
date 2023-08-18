import java.util.List;

public class LeagueSystem {
    private List<Team> teams;
    private List<Player> players;
    private List<Match> matches;

    public static void main(String[] args) {
        Player p=new Player("assem", 7, "Real madrid", 22, 0, "st");
        Player p1=new Player("ali", 10, "Real madrid", 20, 0, "rwf");



        System.out.println(p.getAge());

        p.updateAge(23);
        System.out.println(p.getAge());

        Team t= new Team("Real madrid", 0,  p1, 0);

        t.addPlayer(p1);

        System.out.println(t.diplayPlayers().get(0).getName());

        //Team t= new Team("Real madrid", 0, [], p, 0)
    }

}
