package Unit7;
import java.util.ArrayList;

public class ArrayAdd {
    public static void main(String[] args)
    {
        //Create a method that will allow me to add an element to the end of an array
        int[] myArray = {1,2,3,4};
        ArrayList<String> myStrArr = new ArrayList<String>();
        myStrArr.add("Peter");
        myStrArr.add("Paul");
        myStrArr.add("Mary");
        myStrArr.add("Bo");
        System.out.println(myStrArr);
        String name = myStrArr.remove(0);
        System.out.println(myStrArr);
        System.out.println(name);
        myArray = addElement(myArray, 5);
        myArray = addElement(myArray, 9);
        for(int i = myStrArr.size()-1; i > 0; i--)
	        if(myStrArr.get(i).length() <= 2)
	            myStrArr.remove(i);
        System.out.println(myStrArr);


        for (int val:myArray) //mimic printing array
            System.out.print(val + " ");
        

    }

    public static int[] addElement(int[] arr, int val)
    {
        int[] temp = new int[arr.length+1];
        for (int i = 0; i < arr.length; i++)
        {
            temp[i] = arr[i];
        }
        temp[temp.length-1] = val;
        return temp;
    }
    public static String[] addElement(String[] arr, String val)
    {
        String[] temp = new String[arr.length+1];
        for (int i = 0; i < arr.length; i++)
        {
            temp[i] = arr[i];
        }
        temp[temp.length-1] = val;
        return temp;
    }

   
}
