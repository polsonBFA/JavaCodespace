public class Microwave {

  String brand;
  int maxPower;

  public Microwave (String manufacturer, int power)
  {
    brand = manufacturer;
    maxPower = power;
  }

  /*method with no parameter. Could just cause the turn table to spin */
  public void spin()
  {
    
  }

  /*overloaded spin method. Takes a true or false value to start or stop spin*/
  public void spin(boolean spinVal)
  {
    
  }
  /*cook method. This may not be as helpful because we don't know how long to cook and at what power to cook*/
  public void cook()
  {
    
  }
  /*this cook method specifies how long to cook for. Also passed as a parameter is power level*/
  public void cook(int seconds, int power)
  {
    System.out.println("Cooking for " + seconds + " at " + power + "W");
  }
  /*the cook30 is a common behavior on a microwave*/
  public void cook30()
  {
    cook(30,maxPower);
    
  }
  public void beep()
  {
    
  }
  public void defrost(int time)
  {
    
  }
  public void defrost(int time, int power)
  {
    
  }

}