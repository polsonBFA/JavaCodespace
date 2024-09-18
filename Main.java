public class Main {
   public static void main(String[] args) {
    
   
      Microwave myStove = new Microwave("Samsung", 800);
      Microwave myStove2 = new Microwave("Whirlpool", 1500);
      
      myStove.cook30();
      myStove2.cook30();
      
      String test = new String("Hello");
      System.out.println(test);
    }
}
