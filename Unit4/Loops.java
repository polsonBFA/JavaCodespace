package Unit4;

public class Loops {
    

    public static void main(String[] args) {
        System.out.println("Hello world");
        printTriangle(7);
        printCheckerboard(6);

    }
    public static void printCheckerboard(int n)
    {
    
    for (int row = 0; row < n; row++)
        {
          for (int col = 0; col < n; col++)
          {
            if ((row+col) % 2 == 0)
              System.out.print("#");
            else
              System.out.print("o");
          }
            System.out.println();
        }
    
    
    }
    
    public static void printTriangle(int n)
    {
        String build;
        for (int r = 1; r<=n; r++)
        {
            build = "";
            for (int c = 1; c <= r; c++)
            {
                build += "*";
            }
            System.out.println(build);
        }
    }
}
