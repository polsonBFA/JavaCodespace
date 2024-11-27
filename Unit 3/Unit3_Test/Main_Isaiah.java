class Main_Isaiah {
    public static void main(String[] args) {
      System.out.println("Hello world!");
      codeTest();
    }
  
    /*Exercise 1 */
    public static int max(int x, int y)
    {
    if(x>y)
      return x;
    else if(x<y)
      return y;
    else 
      return x;
      
    }
  
  
    /* Exercise 2 */
    public static double totalWages(double hours, double rate)
    {
      double wages=0;
      if(hours<=40)
       return wages = hours * rate;
      else if(hours>40)
       return wages =((40*rate)+((hours-40)*(rate*1.5)));
      return wages;
    }
  
  
    /* Exercise 3 */
    public static boolean isLeapYear(int year)
    {
     /* int a = isLeapYear%4;
      int b = isLeapYear%100;
      int c = isLeapYear%400;
       if((a=0)&&(b!=0 || c=0))
         return true;
       else */
         return false;
    }
  
  
    /* Exercise 4 */
    public static String orderWords(String s1, String s2, String s3)
    {
      int a = s1.compareTo(String s2);
      int b = s2.compareTo(String s3);
      int c = s1.compareTo(String s3);
      if(a<b && a<c && b<c)
        return(s1,s2,s3);
      else if(a<b && a<c && c<b)
        return(s1,s3,s2);
      else if(c<a && c<b && b<a)
        return(s3,s2,s1);
      else if(b<a && b<c && c<a)
        return(s2,s3,s1);
      else if(b<a && b<c && a<c)
        return(s2,s1,s3);
      else 
        return(s3,s1,s2);
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
  