
package Unit6;
import java.util.*;

public class ATest {
    public static void main (String[] args)
    {
        String[] a1 = {"Bob", "Mary", "Sue"};
        ArrayList<String> arr = new ArrayList<String>();
        for(String name:a1)
        {
            arr.add(name);

        }
        System.out.println(arr);
    }
}
