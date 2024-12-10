public class Stocking {
    
    //these instance variables are stored in dynamically 
    //allocated memory. They BELONG to the instance of the class
    private String owner;
    private int itemCount;  //number of items in a stocking
    private int idNum; //ID number of a stocking

    private static int stockingCount = 0;  //Static variables belong to the class!
    
    public Stocking()
    {
        owner = "";
        itemCount = 0;
        stockingCount ++; 
        idNum = stockingCount;
    }

    public Stocking (String name, int initItems)
    {
        owner = name;
        itemCount = initItems;
        idNum = ++stockingCount;
    }
   public int getItemCount()
   {
        return itemCount;
   }
   public String getOwner() 
   {
    return owner;
   }
   public int getID()
   {
    return idNum;
   }

   public static int getStockingCount()
   {
        return stockingCount;
   }

}

class TestStocking{
    public static void main(String[] args) {
        Stocking s1 = new Stocking();
        Stocking s2 = new Stocking("Mr. Olson", 14);
        Stocking s3 = new Stocking("Caleb", 8);

    

        
    

       
        
    }
}
