import java.util.Scanner;
public class ScannerClass {

    public static void main(String[] args)
    {
        System.out.println("Please type in a name in the input box below.");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Hello " + name);
        System.out.println("Please type in a number.");
        int num = scan.nextInt();
        System.out.println("So far, these variables have been entered: " + name + ", " + num);
        scan.close();
     }
 
}
