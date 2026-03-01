import java.util.*;

class program821
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int X = 0, Y = 0, i = 0, iPow = 0;

        System.out.println("Enter Base :");
        X = sobj.nextInt();

        System.out.println("Enter Power : ");
        Y = sobj.nextInt();

        // X = 5   Y = 3

        for(i = 1, iPow = 1; i <= Y; i++)
        {
            iPow = iPow * X;
        }

        System.out.println(iPow);
    }
}