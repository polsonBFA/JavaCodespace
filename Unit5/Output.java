import java.io.FileWriter;
import java.io.IOException;

public class Output {
    public static void main(String[] args)
    {
        try {
            FileWriter file = new FileWriter("output.txt", true); // true appends
            for (int i = 1; i<=5; i++)
            {
                file.write("Test-Line" + i + "\n" );
            }
            file.close();
     
        } catch (IOException ex) {
            System.out.println("An I/O error occurred.");
            ex.printStackTrace();
            }
    }
}



