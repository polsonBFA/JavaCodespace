public class WordWheel
{

    private String[] wheel1 = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private String[] wheel2 = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private String[] wheel3 = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
private String[] wheel4 = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
  
    private int maxWords = 0; //track max word counts
    private String[] wheelStart = new String[4]; //store position of wheels
    private SpellCheckerDemo spObj = new SpellCheckerDemo();
    
    public void rotate(String[] wheel) //rotates the given wheel
    {
        String temp = wheel[0]; //store first item in the wheel to bump to end
        for (int i = 1; i < wheel.length; i++) //start at one to avoid outOfBoundsError
        {
            wheel[i - 1] = wheel[i];
        }
        wheel[wheel.length - 1] = temp; //put first item at end
    }
    
    public void scanForWords()//check wheels for words
    {
        String str = "";
        int wordCount = 0;
        String wordList = "";
        for (int i = 0; i < wheel1.length; i++)
        {
           str = wheel1[i] + wheel2[i] + wheel3[i] + wheel4[i];
          //if (spObj.linearSpellcheck(str)) //change to binarySpellcheck(str) for comparison!
          if (spObj.binarySpellcheck(str))
           {
             wordCount++;
             wordList += str + ", ";
           }
               
        }
        if (wordCount > maxWords)
        {
            maxWords = wordCount;
            wheelStart[0] = wheel1[0];
            wheelStart[1] = wheel2[0];
            wheelStart[2] = wheel3[0];
            wheelStart[3] = wheel4[0];
            System.out.println("Current Max at: "  + "a, " + wheel2[0] + ", " + wheel3[0]+ ", " + wheel4[0] + " | "+ wordList);
        }
        else if (maxWords > 0 && wordCount == maxWords)
            System.out.println("Tie at: " + "a, " + wheel2[0] + ", " + wheel3[0]+ ", " + wheel4[0] + " | "+ wordList);
        
    }
    
   /* 2. Write a spellcheck() method that takes a word as a
    * parameter and returns true if it is in the dictionary array.
    * Return false if it is not found.
    */
  public String[] getWheel (int num)
  {
    if (num == 1)
      return wheel1;
    else if (num == 2)
      return wheel2;
    else if (num == 3)
      return wheel3;
    //else if (num == 4)
     // return wheel4;
    else
      return null;
  }
  public void printWheel (int num)
  {
    if (num == 1){
      for (String letter:wheel1) {System.out.print(letter); }
      System.out.println();
    }

    else if (num == 2){
      for (String letter:wheel2) {System.out.print(letter);} System.out.println();
    }
    else if (num == 3){
      for (String letter:wheel3) {System.out.print(letter);}        System.out.println();
  }
    //else if (num == 4)
     // return wheel4;

  }
   public void check3Wheels()
   {
     for (int i = 0; i < wheel2.length; i++)
     {
         
         for (int j = 0; j < wheel3.length; j++)
         {
             scanForWords();
             rotate(wheel3);
         }
         rotate(wheel2);
     }
    // System.out.println("Max Number of words found: " + maxWords);
     //System.out.println("Settings as follows: Wheel 1 - " + wheelStart[0] + ", Wheel 2 - " + wheelStart[1] + ", Wheel 3 - " + wheelStart[2]);
     
   
   }

     public void check4Wheels()
   {
     for (int i = 0; i < wheel2.length; i++)
     {
         
         for (int j = 0; j < wheel3.length; j++)
         {
             for (int k = 0; k < wheel4.length; k++){
               scanForWords();
               rotate(wheel4);
             }
             rotate(wheel3);
         }
         rotate(wheel2);
     }
     System.out.println("\nMax Number of words found: " + maxWords);
     System.out.println("Settings as follows: Wheel 1 - " + wheelStart[0] + ", Wheel 2 - " + wheelStart[1] + ", Wheel 3 - " + wheelStart[2] + ", Wheel 4 - " + wheelStart[3]);
   
   }
   public static void main(String[] args) {
    WordWheel game = new WordWheel();
  
    long start = System.currentTimeMillis();
    game.check4Wheels();
    System.out.println("\nAfter checking 26^4 = " + (int) Math.pow(26,4) + " Word Wheel entries...");
    System.out.println("Elapsed Time approximately " + (System.currentTimeMillis()-start)/1000. + " seconds.\n");
  }
      

}
