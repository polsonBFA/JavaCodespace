import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SpellCheckerDemo
   {
      private String[] dictionary;
      
      // WRITE Your Methods HERE!





      public SpellCheckerDemo
      () {
        try
        {
            dictionary = readLines("dictionary.txt");
        }
        catch(IOException e)
        {
            // Print out the exception that occurred
            System.out.println("Unable to access "+e.getMessage());              
        }
        
      }

      public static String[] readLines(String filename) throws IOException 
      {
        FileReader fileReader = new FileReader(filename);
         
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        List<String> lines = new ArrayList<String>();
        String line = null;
         
        while ((line = bufferedReader.readLine()) != null) 
        {
            lines.add(line);
        }
         
        bufferedReader.close();
         
        return lines.toArray(new String[lines.size()]);
      }
    
     public boolean linearSpellcheck(String word)
    {
        
      //code for a linear search 
      for (int i = 0; i < dictionary.length; i++)
        {
            if (word.equals(dictionary[i]))
                return true;
        }
        return false;
    }
//------------------------------------------------
    public boolean binarySpellcheck(String word)
    {
      //Code for a binary search
        int left = 0;
        int right = dictionary.length - 1;
        while (left <= right)
        {
           int middle = (left + right) / 2;
           if (word.compareTo(dictionary[middle]) < 0)
           {
              right = middle - 1;
           }
           else if (word.compareTo(dictionary[middle]) > 0)
           {
              left = middle + 1;
           }
           else {
              return true;
           }
         }
         return false;
      
    }
      
    
   }