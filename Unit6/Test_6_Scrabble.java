package Unit6;

public class Test_6_Scrabble {
    public static void main(String[] args)
    {
        System.out.println("skink - "+computeScore("skink"));
        System.out.println("aardvark - "+computeScore("aardvark"));
        System.out.println("zebra - "+computeScore("zebra"));
        System.out.println("quail - " +computeScore("quail"));

        
    }
    public static int computeScore(String word)
    {
      int total = 0 ;
      String alphabet = "abcdefghijklmnopqrstuvwxyz";
      int[] arr = {1,3,3,2,1,4,2,4,8,8,5,1,3,1,1,3,10,1,1,1,1,4,4,8,4,10};
      for(int i = 0; i < word.length();i++)
      {
      int a = arr[word.indexOf((word.substring(i,i+1)).compareTo(alphabet))];
      total += arr[a];
      }
      return total;
  
    }
  

    // public static int computeScore(String word){
    //     String alphabet = "abcdefghijklmnopqrstuvwxyz";
    //     int[] letterScore = {1,3,3,2,1,4,2,4,8,8,5,1,3,1,1,3,10,1,1,1,1,4,4,8,4,10};
    //     String letter = "";
    //     int letterPos; int score = 0;
        
    //     for (int c = 0; c < word.length(); c++){
    //       letter = word.substring(c,c+1).toLowerCase();
    //       letterPos = alphabet.indexOf(letter);
    //       score += letterScore[letterPos];
    //     }
    //     return score;  
    //   }
    
}
