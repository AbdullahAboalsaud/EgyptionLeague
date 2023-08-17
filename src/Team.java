/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package league;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lenovo
 */
public class Team {
    private String name;
    private int id;
    private List <Player> playersOfTheTeam=new ArrayList<Player>();
    private Player captain;
    private int totalScore;
    
    Team(String name ,int id,Player captin,int totalScore){
        this.name=name;
        this.captain=captin;
//        this.playersOfTheTeam=playersOfTheTeam;
        this.id=id;
        this.totalScore=totalScore;
        
    }
    
    public void addPlayer(Player newPlayer){
        playersOfTheTeam.add(newPlayer);
    }
    
    public List diplayPlayers(){
        return playersOfTheTeam;
    }
    
    
     public String getTeamName( ){
        return name;
    }
    
    public Player getCaptain( ){
        return captain;
    }
    
}
