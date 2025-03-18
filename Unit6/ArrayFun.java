package Unit6;
import java.util.Scanner;

public class ArrayFun {
    
    public static void main(String[] args)
    {
        System.out.println("Hello World");
        int[] intArray = new int[3]; ;  //declares and initialize an integer array;
        

        intArray[0] = (int) (Math.random()*7 + 1);
        intArray[1] = (int) (Math.random()*7 + 1);
        intArray[2] = (int) (Math.random()*7 + 1);

        System.out.println(intArray[0]);
        System.out.println(intArray[1]);
        System.out.println(intArray[2]);

        //create a list list with the first 50 positive even integers using a for loop
        int[] l2 = new int[50];
        for(int i = 0; i <= 49; i++)
        {
            l2[i] = 2 * (i+1);
        }
        System.out.println("[" + l2[0] + ",..., " + l2[49] +"]");

        //make a list with student names from your side of the room
        String[] names = {"Levi", "Silas", "Micah"};
        
        //names[0] = "Levi"; names[1] = "Silas"; names[2] = "Micah"; names[3] = "Jong-In";
        System.out.println(names[1]);

        //Write a method to pick a random student from the list
        //put in a while loop to allow multiple random picks using Scanner class
        boolean stop = false;
        Scanner scan = new Scanner(System.in);

        while(!stop)
        {
            System.out.println(pickStudent(names));
            System.out.println("Press y to pick again: ");
            String choice = scan.nextLine();
            if (!"y".equals(choice))
                stop = true;
            
        }
        scan.close();
        
        System.out.println(names[0].length());
        System.out.println(names.length);
        System.out.println(names[names.length - 1]);

        Fraction[] fracList = {new Fraction(3,4), new Fraction(5,12)};
        System.out.println(fracList[1]);
    }

    public static String pickStudent(String[] sList)
    {
        return  sList[(int)(Math.random()*3)];
    }
}
