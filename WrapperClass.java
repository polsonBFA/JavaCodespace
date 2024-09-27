public class WrapperClass {
   public static void main(String[] args) {
      Integer obj1 = new Integer(3);
      Integer obj2 = 5;
      int x = obj1;
      Integer sum = obj1.intValue() + obj2.intValue();
      System.out.println(sum);
      System.out.println(x);
      //System.out.println( instanceof Integer);

      System.out.println(Integer.MAX_VALUE);
   }

   public static void myMethod(Object myObj){
      
   }
}
