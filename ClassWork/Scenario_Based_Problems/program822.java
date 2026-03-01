import java.util.*;

class program822
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int X = 0, Y = 0, iPow = 0;

        System.out.println("Enter Base :");
        X = sobj.nextInt();

        System.out.println("Enter Power : ");
        Y = sobj.nextInt();

        // X = 5   Y = 3

        iPow = 1;

        while(Y != 0)
        {
            iPow = iPow * X;
            Y--;
        }

        System.out.println(iPow);
    }
}