package Unit9;
//Super calls example
public class First
{
   public void methodOne()
   {
     System.out.print("1");
   }
	
   public void methodTwo()
   {
	    methodOne();
	    System.out.print("2");
   }

}
class Second extends First
{
  public void methodOne()
  {
	super.methodOne();
	System.out.print("A");
  }
	
  public void methodTwo()
  {
	super.methodTwo();
	System.out.print("B");
  }
}

class Third extends Second
{
  public void methodOne()
  {
      System.out.print("X");
      super.methodOne();
  }
	
  public void methodTwo()
  {
	System.out.print("Y");
	super.methodTwo();
  }

  
}



    

