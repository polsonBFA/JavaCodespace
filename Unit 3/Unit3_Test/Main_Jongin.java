class Main_Jongin{
    public static void main(String[] args) {
     codeTest();
    }
  
  /*Exercise 1
    /3 points
   +2 if-else statement
   +1 correct return
   */
  
    public static int max(int x, int y)
    {
      if (x>y)
        {return x;}
      else if (y>x)
        {return y;}
      else
        {return x;}
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
      double newRate = 1.5 * rate;
      if (hours > 40)
        {
          wages = (hours - 40) * newRate + 40*rate;
        }
      else
        {
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
      if (year % 4 == 0)
        {return true;}
      else  
        {return false;}  
      
    }
  
  
   /* Exercise 4
   6/6 Points
   +4 if-else statement
   +1 correct handling of compareTo() method
   +1 correct return statement
   */
    public static String orderWords(String s1, String s2, String s3)
    { 
      String answer;
      if (s1.compareTo(s2)>0 && s1.compareTo(s3)>0)
        {if (s2.compareTo(s3)>0)
          {answer = s3 + " " + s2 + " " + s1;
          return answer;}
        else if (s2.compareTo(s3)<0)
        {answer = s2 + " " + s3 + " " + s1;
        return answer;}
        else
        {answer = s2 + " " + s3 + " " + s1;
          return answer;}}
      else if (s2.compareTo(s1)>0 && s2.compareTo(s3)>0)
        {if (s1.compareTo(s3)>0)
          {answer = s3 + " " + s1 + " " + s2;
          return answer;}
        if (s1.compareTo(s3)<0)
        {answer = s1 + " " + s3 + " " + s2;
        return answer;}
      else
        {answer = s1 + " " + s3 + " " + s2;
          return answer;}}
      else if (s3.compareTo(s1)>0 && s3.compareTo(s2)>0)
        {if (s1.compareTo(s2)>0)
          {answer = s2 + " " + s1 + " " + s3;
          return answer;}
        if (s1.compareTo(s2)<0)
        {answer = s1 + " " + s2 + " " + s3;
        return answer;}
      else 
      {answer = s1 + " " + s2 + " " + s3;
      return answer;}}
      else
          answer = s1 + " " + s2 + " " + s3;
          return answer;}
      
      
      
  
  
  
      
  
    
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