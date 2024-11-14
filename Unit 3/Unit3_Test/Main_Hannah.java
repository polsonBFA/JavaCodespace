class Main_Hannah {
    public static void main(String[] args) {
      System.out.println(orderWords("taco", "zoo", "taco"));
      codeTest();
    }
  
   /*Exercise 1
 Score /3
 +2 if-else statement
 +1 correct return
 */

    public static int max(int x, int y)
    {
      if (x > y) {
        return x;
      }
      else if (y > x){ //Here you could have simplified this with a single else...if x not largest, what must be?
        return y;
      }
      else {
        return x;
      }
  
    }
  
  
 /* Exercise 2
 /5 points
 +2 if-else statement
 +2 correct computation of wages
 +1 correct return statement
 */

    public static double totalWages(double hours, double rate)
    {
        double wages;
    
      if (hours > 40){
        wages = ((hours - 40) * (rate * 1.5)) + (40 * rate);
      }
      else {
        wages = hours * rate;
      }
    
      return wages;
    }
  
  
     /* Exercise 3
 5/5 points
 +1 if-else statement
 +3 correct boolean logic
 +1 correct return statement
 */

    public static boolean isLeapYear(int year)
    {
       if (year % 4 == 0 && (!(year % 100 == 0) || (year % 400 == 0))) {
        return true;
       }
       else {
        return false;
       }
        
  
    }
  
  
 /* Exercise 4
 6/6 Points
 +4 if-else statement
 +1 correct handling of compareTo() method
 +1 correct return statement

 OK, your logic works, but it is more checks than you need consider
 if (word1.compareTo(word2)<=0) you know that w1 comes before w2 (even if the same) 
    nested within this if statement, you could check if where w3 fits in the sequence. For example
    if (w3.compareTo(w2)>=0) 
        //words in order
    else if (w3.compareTo(w1)<=0)
        //w3 comes first
    else
        //only one scenario remains!
 */

    public static String orderWords(String s1, String s2, String s3)
    {
      if (s1.compareTo(s2) < 0 && s2.compareTo(s3) < 0)
        return s1 + ", " + s2 + ", " + s3;
      else if (s1.compareTo(s3) < 0 && s3.compareTo(s2) < 0)
        return s1 + ", " + s3 + ", " + s2;
      else if (s2.compareTo(s1) < 0 && s1.compareTo(s3) < 0)
        return s2 + ", " + s1 + ", " + s3;
      else if (s2.compareTo(s3) < 0 && s3.compareTo(s1) < 0)
        return s2 + ", " + s3 + ", " + s1; 
      else if (s3.compareTo(s1) < 0 && s1.compareTo(s2) < 0)
        return s3 + ", " + s1 + ", " + s2;
      else if (s3.compareTo(s2) < 0 && s2.compareTo(s1) < 0)
        return s3 + ", " + s2 + ", " + s1;
      else if (s1.equals(s2) && s1.compareTo(s3) < 0)
        return s1 + ", " + s2 + ", " + s3;
      else if (s1.equals(s2) && s1.compareTo(s3) > 0)
        return s3 + ", " + s1 + ", " + s2;
      else if (s2.equals(s3) && s2.compareTo(s1) < 0)
        return s2 + ", " + s3 + ", " + s1;
      else if (s2.equals(s3) && s2.compareTo(s1) > 0)
        return s1 + ", " + s3 + ", " + s2;
      else if (s1.equals(s3) && s1.compareTo(s2) < 0)
        return s1 + ", " + s3 + ", " + s2;
      else if (s1.equals(s3) && s1.compareTo(s2) > 0)
        return s2 + ", " + s1 + ", " + s3;
      else if (s1.equals(s3) && s2.equals(s3))
        return s1 + ", " + s2 + ", " + s3;
      else
        return "Change words!";
      
  
    }

    public static void codeTest()
    {
      System.out.println("Testing max()");
      System.out.println(max(-2, 0));
      System.out.println(max(3,3));
      System.out.println(max(3,2));
      
      System.out.println("Testing TotalWages()");
      System.out.println(totalWages(45, 12.50));
      System.out.println(totalWages(28, 10.0));
      
      System.out.println("isLeapYear()");
      System.out.println(isLeapYear(2000));
      System.out.println(isLeapYear(2004));
      System.out.println(isLeapYear(2003));
      System.out.println(isLeapYear(2100));
      
      System.out.println("Testing orderWords()");
      System.out.println(orderWords("a", "b", "c"));
      System.out.println(orderWords("a", "c", "b"));
      System.out.println(orderWords("b", "a", "c"));
      System.out.println(orderWords("b", "c", "a"));
      System.out.println(orderWords("c", "b", "a"));
      System.out.println(orderWords("c", "a", "b"));
      System.out.println(orderWords("c", "a", "c"));
  
    }
  }
  
