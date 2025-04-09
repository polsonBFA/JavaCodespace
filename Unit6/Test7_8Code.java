package Unit6;

public class Test7_8Code {
    
    public static void main(String[] args)
    {
        int[][] mat = {{1,2,3},{5,4,6}};
        printMat(expandMatrix(mat));
    }
    public static void printMat(int[][] myArr)
    {
        for (int[] row:myArr )
        {
            for (int val:row)
                System.out.print(val + " ");
            System.out.println();
        }
    }
    public static int[][] expandMatrix(int[][] matA)
    {
        int row = 2*matA.length; int col = 2*matA[0].length;
        int[][] matAEx = new int[2*matA.length][2*matA[0].length];
        int r = 0; int c= 0;
        for( int i = 0; i<row; i++)
        {
            if(i!=0 && i%2==0)
            {
                r++;
            }
            for ( int j=0; j<col; j++)
            {
                
                if(j!=0 && j%2==0)
                {
                c++;
                }
            
                
                    matAEx[i][j] = matA[r][c];
                
                      
                    
            }
            c=0; 
                // matAEx[2*row][2*col] = matA[row][col];
                // matAEx[2*row][2*col+1] = matA[row][col];
                // matAEx[2*row+1][2*col] = matA[row][col];
                // matAEx[2*row+1][2*col+1] = matA[row][col];
        }
            
        
        return matAEx;
    }

}
