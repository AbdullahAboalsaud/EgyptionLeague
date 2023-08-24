/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lenovo
 */
public class Player {
    private String name;
    private int number;
    private Team team;
    private int age;
    private int score;
    int rank;
    private String role;

    public Player() {
    }

    Player(String name, int number, Team team, int age , int score, String role){
        this.name=name;
        this.number=number;
        this.team=team;
        this.age=age;
        this.score=score;
        this.role=role;
    }
    
    public String getName(){
        return name;
    }
    
    
    public int getNumber(){
        return number;
    }
    
    
    public Team getTeam(){
        return team;
    }

    public int getRank() {
        return rank;
    }
    
    public int getAge(){
        return age;
    }
    
    public int getScore(){
        return score;
    }

    
    public String getRole(){
        return name;
    }
    public void updateName(String name){
        this.name=name;
    }
    public void updateAge(int age){
        this.age=age;
    }
    public void updateNumber(int number){
        this.number=number;
    }
    public void updateScore(int score){
        this.score=score;
    }
    public void updateRole(String role){
        this.role=role;
    }
    public void updateTeam( Team team){
    this.team=team;
    }
}
