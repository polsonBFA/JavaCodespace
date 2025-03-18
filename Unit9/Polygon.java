package Unit9;
import java.util.ArrayList;

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
    public String toString()
    {
        return "I am a " + shapeName + " with " + numSides + " sides.";
    }
    public static void main(String[] args)
    {
        Polygon p1 = new Polygon(5, "Pentagon");
        EquilateralTriangle t1 = new EquilateralTriangle(3);
        Triangle t2 = new Triangle(3,4,5);
        Square s1 = new Square();

        System.out.println(p1.getName() + "-" + p1.getSides());
        //System.out.println(s1);
       // System.out.println(t1);

        ArrayList<Polygon> shapes = new ArrayList<Polygon>();
        shapes.add(p1);
        shapes.add(t1);
        shapes.add(t2);
        shapes.add(s1);

        for(Polygon item:shapes)
            System.out.println(item);

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
}

class Square extends Polygon
{
    public Square()
    {
        super(4, "Square");
    }

}

