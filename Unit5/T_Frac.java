

public class T_Frac {
    private int num;
    private int denom;

    public T_Frac(int num, int denom)
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
        return denom;
    }
    public T_Frac multiply(T_Frac otherFrac)
    {
        return multiply(this,otherFrac);
    }
    public static T_Frac multiply(T_Frac x, T_Frac y)
    {
        return new T_Frac(x.getNum()*y.getNum(), x.getDenom()*y.getDenom());
    }
    public String toString()
    {
        return num + "/" + denom;
    }
}

class Test_TFrac{
    public static void main(String[] args)
    {
        //How do I create a fraction that is the product of two fractions?
        T_Frac f1 = new T_Frac(2,3);
        T_Frac f2 = new T_Frac(4,5);
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(T_Frac.multiply(f1,f2));
        System.out.println(f1.multiply(f2));
        System.out.println(f2.multiply(f1));
        
    }
}
