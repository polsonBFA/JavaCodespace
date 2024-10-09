import java.util.Scanner;

public class Magic8Ball
{
   
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      System.out.println("What is a question that you would like to ask? ");
      String question = scan.nextLine();
      System.out.println(question);
   }
}