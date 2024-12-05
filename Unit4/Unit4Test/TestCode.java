package Unit4.Unit4Test;

public class TestCode {
public static void main(String[] args) {
    drawSquare(5);
}
public static String removeSpaces(String str)
{
    String word = "";
    for (int i = 0; i<str.length();i++)
    {
        if(!((str.substring(i, i+1).equals(" "))))
        {
            word += str.substring(i, i+1);
        }
    }
    return word;
}

public static void drawSquare(int n)
{
    int num = 0;
    for(int rows =0; rows<=n; rows++)
    {   num = n;
        for(int col = 0; col<=n; col++)
        {
            System.out.print(num);
        }
        num = num-1;
        System.out.println();
    }
}
    public static int sumUpToFor(int n)
{
    int sum = 0;
 
      while(n>=1){
        sum=sum+(n-1);
        n--;
      }
    return sum;
}

}
