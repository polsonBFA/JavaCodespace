package Unit3_Test;

public class ReSilas {
    public static void main(String[] args) {
        System.out.println("\nTesting isEven");
        System.out.println(isEven(15));
        System.out.println(isEven(-210));
        System.out.println(isEven(0));

       
          System.out.println("\nTesting triangleType");
          System.out.println(triangleType(15, 2, 2));
          System.out.println(triangleType(2, 15, 2));
          System.out.println(triangleType(15, 2, 2));
          System.out.println(triangleType(15, 15, 15));
          System.out.println(triangleType(15, 2, 3));
          
          System.out.println("\nTesting classifyNumber");
          System.out.println(classifyNumber(15));
          System.out.println(classifyNumber(-15));
          System.out.println(classifyNumber(122));
          System.out.println(classifyNumber(-150));
          System.out.println(classifyNumber(15-15));

          System.out.println("\nTesting isLater");
          System.out.println(isLater(2, 11, 2024, 3,11, 2024));
          System.out.println(isLater(2, 11, 2023, 3,11, 2024));
          System.out.println(isLater(2, 11, 2025, 3,11, 2024));
          System.out.println(isLater(10, 12, 2024, 3,11, 2024));
      }

  
      
        /* Exercise 1 */
        public static boolean isEven (int x) 
        {
      
          if(x % 2 == 0)
          {
            return true;
          }
          else
          {
            return false;
          }
        
        }
      
      
        /* Exercise 2 */
        public static String triangleType(int a, int b, int c) 
        {
             
            if(a == b && b == c && a == c)
            {
              return "Equilateral";
            }
            else
            {
              if(a == b || b == c || a == c)
              {
                return "Isosceles";
              }
              else
              {
                return "Triangle";
              }
            }
        
            
        }
      
      
        /* Exercise 3 */
        public static String classifyNumber(int num) // :)
        {
           if(num > 0)
           {
              if(num % 2 == 0)
              {
                return "Positive even";
              }
              else
              {
                return "Positive odd";
              }
           }
           else if(num == 0)
           {
              return "Zero";
           }
           else
           {
              if(num % 2 == 0)
              {
                return "Negative even";
              }
              else
              {
                return "Negative odd";
              }
           }
        }
      
      
        /* Exercise 4 */
        public static boolean isLater(int month1, int day1, int year1, int month2, int day2, int year2)
        {
          //check year
          if(year1 > year2)
          {
            return true;
          }
          else if(year1 < year2)
          {
            return false;
          }
          //check month
          if(month1 > month2)
          {
            return true;
          }
          else if(month1 < month2)
          {
            return false;
          }
          //if everything is the same except for the day so far, check day
          return day1 > day2;
      
      
         
        }
      
      
}
