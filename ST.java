public class ST{
    private String name;
    private int wins;
    private int losses;
    private int ties;
    private int goals;
    private int goalsAgainst;
  
    private static int numMatches = 0;
    private static int totalGoals = 0;
    
   /* public ST()
    {
      name = "";
      wins = 0;
      losses = 0;
      ties = 0;
      goals = 0;
      goalsAgainst = 0;
      
    }*/
  public ST(String name)
    {
      this.name = name;
      wins = 0;
      losses = 0;
      ties = 0;
      goals = 0;
      goalsAgainst = 0;
    }
    public int getPoints()
    {
      return 3*wins + 1*ties;
    }
    public void reset()
    {
      wins = 0;
      losses = 0;
      ties = 0;
    }
  public void gameResult(String result)
    {
        if (result == "win")
          wins++;
        else if (result == "tie")
          ties++;
        else if (result == "loss")
          losses++;
    }
    public void played(ST other, int myScore, int otherScore)
    {
      numMatches++;
      totalGoals+= myScore + otherScore;
      
      if (myScore > otherScore)
      {
        gameResult("win");
        other.gameResult("loss"); 
      }
      else if (myScore == otherScore)
      {
        gameResult("tie");
        other.gameResult("tie");
      }
      else
      {
        gameResult("loss");
        other.gameResult("win");
      }
    }
    
    public static int getGamesPlayed()
    {
      return numMatches;
      
    }
    public static int getGoalsScored()
    {
      return totalGoals;
    }
    public static void startTournament()
    {
      numMatches = 0;
      totalGoals = 0;
    }
    public String toString()
    {
      return name + ": " + wins + " " + ties + " " + losses + " " + getPoints();
    }
  }
  
  class TestSoccerClass {
    public static void main(String[] args) {
      System.out.println("Hello world!");
      ST qt = new ST("Qatar");
      ST ec = new ST("Ecuador");
      ST se = new ST("Senegal");
      ST ne = new ST("Netherlands");
      //System.out.println(qt);
  
      qt.played(ec, 0, 2);
      se.played(ne, 0, 2);
      qt.played(se, 1, 3);
      ne.played(ec, 1,1);
      ec.played(se, 1, 2);
      ne.played(qt, 2, 0);
  
      System.out.print(qt + "\n" + ec + "\n" + se + "\n" + ne + "\n");
      
      System.out.println("Matches Played: " + ST.getGamesPlayed());
      System.out.println("Goals Scored: " + ST.getGoalsScored());
      
    }
  }
  
