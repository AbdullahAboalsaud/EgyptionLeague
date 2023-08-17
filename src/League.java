/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package league;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lenovo
 */
public class League {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player p=new Player("assem", 7, "Real madrid", 22, 0, "st");
        Player p1=new Player("ali", 10, "Real madrid", 20, 0, "rwf");
        
        
        
        System.out.println(p.getAge());
        
        p.updateAge(23);
        System.out.println(p.getAge());
        
        Team t= new Team("Real madrid", 0,  p1, 0);
        
        t.addPlayer(p1);
        
        System.out.println(t.diplayPlayers());
       
        //Team t= new Team("Real madrid", 0, [], p, 0)
    }
    
}
