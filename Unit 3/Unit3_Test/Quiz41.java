public class Quiz41 {
    public static void main(String[] args) {
        generateRandomNums();

    }
    public static void generateRandomNums()
    {
     boolean done = false;
     int count = 0;
     int number;
     while(done != true)
     {
        count++;
        number = (int)(Math.random()*10);
        System.out.print(number + ", ");
        if (number == 0){
            done = true;
        }

     }
       System.out.println("");
       System.out.println("The sequence has " + count + ".");
    }
}

/* int len = 1;
        boolean isZero = false;
        int rn;
        while (!isZero)
        {
            rn = (int)((Math.random())*(10));
            if (rn == 0)
            {
                isZero = true;
                System.out.print(rn);
                System.out.println("The sequence has a length of " + len);
            }
            System.out.print(rn + ", ");
            len++;
            
        } */