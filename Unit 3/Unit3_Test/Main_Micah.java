class Main_Micah {
    public static void main(String[] args) {
      System.out.println("Hello world!");
      codeTest();
    }
  
    /*Exercise 1 */
    public static int max(int x, int y)
    {
      if( x > y )
        {
          return x;
        }
      
      else if ( y > x)
        {
          return y;
        }
      
      else
        {
          return x;
        }
    }
  
  
    /* Exercise 2 */
    public static double totalWages(double hours, double rate)
    {
        double wages;
    
      if ( hours > 40)
      {
        wages = ((hours*rate)+(hours-40)*(rate*1.5));
      }
      
      else
      {
        wages = (hours*rate);
      }
  
      return wages;
    }
  
  
    /* Exercise 3 */
    public static boolean isLeapYear(int year)
    {
      if ( (year % 4 == 0) && (year % 100 != 0) && (year % 400 != 0))
      {
        return true;
      }
  
      else
        return false;
    }
  
  
    /* Exercise 4 */
    public static String orderWords(String s1, String s2, String s3)
    {
      if ( (s1.substring(0,1).compareTo(s2) < 0) && (s2.substring(0,1).compareTo(s3) < 0))
      {
        return (s1 + ", " + s2 + ", " + s3);
      }
  
      else if ( (s1.substring(0,1).compareTo(s3) < 0) && (s3.substring(0,1).compareTo(s2) < 0))
      {
        return (s1 + ", " + s3 + ", " + s2);
      }
  
      else if ( (s2.substring(0,1).compareTo(s1) < 0) && (s1.substring(0,1).compareTo(s3) < 0))
      {
        return (s2 + ", " + s1 + ", " + s3);
      }
  
      else if ( (s2.substring(0,1).compareTo(s3) < 0) && (s3.substring(0,1).compareTo(s1) < 0))
      {
        return (s2 + ", " + s3 + ", " + s1);
      }
  
      else if ( (s3.substring(0,1).compareTo(s1) < 0) && (s1.substring(0,1).compareTo(s2) < 0))
      {
        return (s3 + ", " + s1 + ", " + s2);
      }
  
      else if ( (s3.substring(0,1).compareTo(s2) < 0) && (s2.substring(0,1).compareTo(s1) < 0))
      {
        return (s3 + ", " + s2 + ", " + s1);
      }
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
  
