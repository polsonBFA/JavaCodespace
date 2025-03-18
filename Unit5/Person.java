public class Person {
   
   //define instance variables
   private String name;
   private String email;
   private String phone;
  
   //Constructor - how to build a new person
   public Person (String initName, String initEmail, String initPhone)
   {
      name = initName;  //initializing instance variables...
      email = initEmail;
      phone = initPhone;
   }

   public void print()
   {
      System.out.println("Name: " + name);
      System.out.println("Email: " + email);
      System.out.println("Phone: " + phone);
   }
   public String toString()
   {
      return "Name: " + name + "\nEmail: " + email +"\n"+"Phone: " + phone;
   }
   public static void main(String[] args)
   {
      Person person1 = new Person("Peter", "peter.olson@bfacademy.de", "112");
      person1.print();
      System.out.println(person1);
   }

}
