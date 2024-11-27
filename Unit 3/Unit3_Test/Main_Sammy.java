public class Main_Sammy {
        public static void main(String[] args) {
          System.out.println(max(2, 3));
          codeTest();
        }
      
        /*Exercise 1 */
        public static int max(int x, int y)
        {
          if (x > y)
            return x;
          else if (x < y)
          return y;
            else
              return x;
          // you could return y in the "else" statement but they're both the same
        }
        public static double totalWages(double hours, double rate)
        {
          double wages;
          double bonus;
          wages = (hours * rate);
          bonus = (hours % 40) * (rate * 1.5);
            if (hours > 40)
            return wages + bonus;
              else
            return wages;
        }

 /* Exercise 4 */
 public static String orderWords(String s1, String s2, String s3)
 {
   if ((s1.compareTo(s2) < 0) && (s1.CompareTo(s3) < 0))
   {
     if ((s2.compareTo(s3) < 0))
         {
         return s1 + " " + s2 + " " + s3;
         }
     else
       return s1 + " " + s3 + " " + s2;
  }
   else if (((s2.compareTo(s1) < 0)) && ((s2.CompareTo(s3) < 0)))
     {
       if ((s1.compareTo(s3) < 0))
           {
           return s2 + " " + s1 + " " + s3;
           }
       else
         return s2 + " " + s3 + " " + s1;
     }
         else if (((s3.compareTo(s1) < 0)) && ((s1.CompareTo(s2) < 0)))
             {
               if ((s1.compareTo(s2) < 0))
                   {
                   return s3 + " " + s1 + " " + s2;
                   }
               else
                 return s3 + " " + s2 + " " + s1;
                   }

    
    
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