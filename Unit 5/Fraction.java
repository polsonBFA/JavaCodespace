public class Fraction {
    private int num;
    private int denom;

    public Fraction(int num, int denom)
    {
        this.num = num;
        this.denom = denom;
        
    }
    public int getNum()
    {
        return num;
    }
    public int getDenom()
    {
        return this.denom;
    }
   public String toString()
    {
        return num + "/" + denom;
    }
    
    public Fraction multiply(Fraction otherFrac)
    {
        return multiply(this, otherFrac);
    }
    public static Fraction multiply(Fraction x, Fraction y)
    {
        return new Fraction(x.getNum()*y.getNum(), x.getDenom()*y.getDenom());
    }

}

class TestFraction
{
    public static void main(String[] args)
    {
        Fraction f1 = new Fraction(2,3);
        System.out.println(f1);
        Fraction f2 = new Fraction(5,8);
        System.out.println(Fraction.multiply(f1,f2));
        System.out.println(f1.multiply(f2));
        System.out.println(f2.multiply(f1));
    }
}
