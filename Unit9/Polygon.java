package Unit9;

public class Polygon {
  
    private String shapeName;
    private int numSides;

    public Polygon()
    {
        numSides = 0;
        shapeName = "Polygon";
        System.out.println("Polygon 0-Param constructor called");
    }

    public Polygon(int s, String name)
    {
        numSides = s;
        shapeName = name;
    }

    public String getName()
    {
        return shapeName;
    }
    public int getSides()
    {
        return numSides;
    }

    public String compareSides(Polygon p2)
    {
        if (this.getSides() < p2.getSides())
        {
            return this.shapeName + " has fewer sides than " + p2.getName() + ".";
        }
        else if (this.getSides() > p2.getSides())
        {
           return this.shapeName + " has more sides than " + p2.shapeName + ".";
        }
        return this.shapeName + " has the same number of sides as " + p2.getName() + ".";
    }
    public String toString()
    {
        return "I am a " + shapeName + " with " + numSides + " sides.";
    }
    public static void main(String[] args)
    {
    //     Polygon p1 = new Polygon(5, "Pentagon");
    //     EquilateralTriangle t1 = new EquilateralTriangle(3);
    //     Triangle t2 = new Triangle(3,4,5);
    //     Square s1 = new Square();

    //     System.out.println(p1.getName() + "-" + p1.getSides());
    //     //System.out.println(s1);
    //    // System.out.println(t1);
    //     ArrayList<Polygon> shapes = new ArrayList<Polygon>();
    //     shapes.add(p1);
    //     shapes.add(t1);
    //     shapes.add(t2);
    //     shapes.add(s1);

       EquilateralTriangle t1 = new EquilateralTriangle(3);
       Triangle t2 = new EquilateralTriangle(4);
       Polygon t3 = new EquilateralTriangle(2);
       System.out.println(t1);
       System.out.println(t2);
       System.out.println(t3);
       
        

    }
}

class Triangle extends Polygon
{
    private int[] sides = new int[3];
    
    public Triangle()
    {
        super(3, "Triangle");
    }
    public Triangle(int s1, int s2, int s3) //pass in side lengths
    {
       this();
       sides[0] = s1;
       sides[1] = s2;
       sides[2] = s3;
    }
    public String toString()
    {
        return super.toString() + "\n My sidelengths are: " + sides[0] + "-" + sides[1] +"-"+sides[2]+"";
    }
}

class EquilateralTriangle extends Triangle
{
    public EquilateralTriangle(int sideLength)
    {
        super(sideLength, sideLength, sideLength);
    }
    public String toString()
    {
        return "EQ" + super.toString();
    }
}

class Square extends Polygon
{
    public Square()
    {
        super(4, "Square");
    }

}

