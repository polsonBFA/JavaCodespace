public class Language{

    public static String piglatin(String str)
    {
      return str + " in Pig Latin is: " + str.substring(1) + str.substring(0,1) + "ay";
    }
    public static String french(String str)
    {
      return str + " in French is: \"le " + str + "\"";
    }
      public static String spanish(String str)
    {
      return str + " in Spanish is: el " + str;
    }
      public static String german(String str)
    {
      return str + " in German is: der " + str;
    }

  }
  
 