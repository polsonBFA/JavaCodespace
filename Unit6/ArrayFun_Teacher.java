package Unit6;
import java.util.Scanner;

public class ArrayFun_Teacher {
    
    public static void main(String[] args)
    {
        int[] intList = new int[3];
        System.out.println(intList[0]);

        intList[0] = (int) (Math.random()*7) +1;
        intList[1] = (int) (Math.random()*7) +1;
        intList[2] = (int) (Math.random()*7) +1;
        System.out.println(intList[0]);
        System.out.println(intList[1]);
        System.out.println(intList[2]);
        System.out.println(intList);

        int[] iList2 = new int[50];
        for(int i = 0; i<= 49; i++)
        {
            iList2[i] = (i+1) * 2;
        }

        //String[] myString = new String[4];
        String[] myString = {"Levi", "Micah","Silas", "Jong-In"};
        System.out.println(myString[1]);
       /* myString[0] = "Levi";
        myString[1] = "Micah";
        myString[2] = "Silas";
        myString[3] = "Jong-In";*/
        boolean myFlag = true;
        
        Scanner scan = new Scanner(System.in);
        while(myFlag)
        {
            System.out.println(pickRandomStudent(myString));
            System.out.println("Enter Y to choose another, Anything else to quit: ");
            String strIn = scan.nextLine();
            if (!strIn.equals("Y"))
                myFlag = false;
        }
        scan.close();
        System.out.println(myString[1].length());//element 1 has length 5
        System.out.println(myString.length);//array has length 4

        Fraction[] myFlist = {new Fraction(3,4), new Fraction(5,7)};
        System.out.print(myFlist[0]);
    }

    public static String pickRandomStudent(String[] stList)
    {
        return stList[(int) (Math.random()*4)];
    }
}
