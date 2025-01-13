package Unit5Test;

public class SoccerTeam
{
    private String n = "";
    private int w = 0;
    private int l = 0;
    private int t = 0;
    private static int goals = 0;
    private static int games = 0;

    public SoccerTeam(String in)
    {
        n = in;
        w = 0;
        l = 0;
        t = 0;
    }

    public SoccerTeam(String in, int iw, int il, int it)
    {
        n = in;
        w = iw;
        l = il;
        t = it;
    }

    public void reset()
    {
        w = 0;
        l = 0;
        t = 0;
    }

    public void setw(int iw)
    {
        w += iw;
    }

    public void setl(int il)
    {
        l += il;
    }

    public void sett(int it)
    {
        t += it;
    }

    public int getPoints()
    {
        return (this. w*3)+(this. t);
    }

    public static String getMatchesPlayed()
    {
        return "Matches Played: " + games;
    }

    public static String getGoalsScored()
    {
        return "Goals Scored: " + goals;
    }

    public String toString()
    {
        return n + ": " + w + " " + l + " " + t + " " + this. getPoints();
    }

    public void played(SoccerTeam n, int goal1, int goal2)
    {
        if (goal2 > goal1)
        {
            this.setw(1);
            n.setl(1);
            goals = goals + goal2 + goal1;
            games++;
        }

        else if (goal2 < goal1)
        {
            this.setl(1);
            n.setw(1);
            goals = goals + goal2 + goal1;
            games++;
        }

        else if (goal2 == goal1)
        {
            this.sett(1);
            n.sett(1);
            goals = goals + goal2 + goal1;
            games++;
        }

    }
    public static void main(String[] args) 
  {
    
    System.out.println("Hello world!");
    SoccerTeam nl = new SoccerTeam("Netherlands");
    SoccerTeam sg = new SoccerTeam("Senegal");
    SoccerTeam eq = new SoccerTeam("Equador");
    SoccerTeam qt = new SoccerTeam("Qatar");

    qt.played(eq, 2, 0);
    sg.played(nl, 2, 0);
    qt.played(sg, 3, 1);
    nl.played(eq, 1, 1);
    eq.played(sg, 2, 1);
    nl.played(qt, 0, 2);

    System.out.println(nl.toString());
    System.out.println(sg.toString());
    System.out.println(eq.toString());
    System.out.println(qt.toString());
    System.out.println(" ");
    System.out.println(SoccerTeam.getMatchesPlayed());
    System.out.println(SoccerTeam.getGoalsScored());

  }
}



