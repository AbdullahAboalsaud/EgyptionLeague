import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private int id;
    private List <Player> playersOfTheTeam = new ArrayList<Player>();
    private Player player;
    private int totalScore;

    public Team() {
    }

    public Team(String name) {
        this.name= name;
    }

    Team(String name , int id, Player player, int totalScore){
        this.name=name;
        this.player=player;
        this.id=id;
        this.totalScore=totalScore;

    }

    
    public void addPlayer(Player newPlayer){
        playersOfTheTeam.add(newPlayer);
    }
    
    public List<Player> diplayPlayers(){
        return playersOfTheTeam;
    }
    
    
     public String getTeamName( ){
        return name;
    }
    
    public Player getCaptain( ){
        return player;
    }
    
}
