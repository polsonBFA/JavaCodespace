package Quiz;
class Main {
  public static void main(String[] args) {
    int[][] vArray = randSquareArray(4);
    printArray(vArray);
    System.out.println(sumOfDiagonal(vArray));
   
  }
  
  public static int[][] randSquareArray(int n)
  {
    int[][] sArray = new int[n][n];
    for (int row = 0; row < n; row++)
    {
      for (int col = 0; col < n; col++)
      {
        sArray[row][col] = (int)(Math.random()*21) - 10;
      }
    }
    return sArray;
  } 

  public static int sumOfDiagonal2(int[][] arr)
  {
    int sum = 0;
    for (int i = 0; i < arr.length; i++)
    {
      sum += arr[i][i];
    }
    return sum;
  }

  public static int sumOfDiagonal(int[][] arr)
  {
    int sum = 0;
    for (int row = 0; row<arr.length; row++)
    {
      for(int col = row; col <= row; col++)
      {
        sum += arr[row][col];
      }
    }
    return sum;
  }
  public static void printArray(int[][] arr)
  {
    for (int row = 0; row < arr.length; row++)
    {
      for (int col = 0; col < arr[0].length; col++)
      {
        System.out.print(arr[row][col] + " ");
      }
      System.out.println();
    }
  }
  }
