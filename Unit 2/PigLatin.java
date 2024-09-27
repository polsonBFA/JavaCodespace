import java.util.Scanner;

public class PigLatin {


    public static void main(String[] args)
    {
        System.out.println("Please type a word to translate: ");
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
      

        // Change this to use word.substring to construct the pig latin
        // version of word. It should work even if you change the value of
        // word above.
        String pigLatin = word.substring(1) + "-" + word.substring(0,1)+ "ay";
 
 
        System.out.println(word + " in Pig Latin is " + pigLatin);
        System.out.println(word + " in French is " + "\'le " + word+"\'");
        System.out.println(word + " in Spanish is " + "\'el " + word+"\'");
        System.out.println(word + " in German is " + "\'der " + word+"\'");
        scan.close();
     }

}
