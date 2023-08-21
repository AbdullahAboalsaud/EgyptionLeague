import java.util.Date;

public class Match {
private int id;
private Date date;
private Team Home;
private Team Away;
private String referee;
private String score;
private String stadiumName;

   public Match(int id, Date date, Team Home,Team Away, String referee, String score, String stadiumName) {
        this.id = id;
        this.date = date;
        this.Home = Home;
        this.Away = Away;
        this.referee = referee;
        this.score = score;
        this.stadiumName = stadiumName;
    }

    public int getId() {
        return id;
    }



    public Date getDate() {
        return date;
    }


    public Team getHome() {
        return Home;
    }

 

    public Team getAway() {
        return Away;
    }

   

    public String getReferee() {
        return referee;
    }



    public String getScore() {
        return score;
    }

  

    public String getStadiumName() {
        return stadiumName;
    }

   

   public void updateMatch(Date newDate,Team newTeamHome,Team newTeamAway,String newReferee,String stadiumName,String score) 
{
this.Away=newTeamAway;
this.Home=newTeamHome;
this.date=newDate;
this.referee=newReferee;
this.score=score;
this.stadiumName=stadiumName;

}
 
public void display(){
    System.out.println("ID:"+this.id+"Date:"+this.date+" Referee:"+this.referee+" Score:"+this.score+" StadiumName:"+this.stadiumName+" TeamHome:"+this.Home+" TeamAway:"+this.Away);
}




}
