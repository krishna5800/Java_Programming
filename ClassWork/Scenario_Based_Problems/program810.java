import java.util.*;

class program810
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number of rows in Theater : ");
        int R = sobj.nextInt();

        System.out.println("Enter Number of columns in Theater : ");
        int C = sobj.nextInt();

        if(R <= 0 || C <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        int Seats[][] = new int[R][C];
        int i = 0;
        int j = 0;

        System.out.println("Enter Booking Details : (0/1)");

        for(i = 0; i < R; i++)
        {
            System.out.println("Enter deatils of row : " + (i+1));
            for(j = 0; j < C; j++)
            {
                Seats[i][j] = sobj.nextInt();

                if(Seats[i][j] != 1 && Seats[i][j] != 0)
                {
                    System.out.println("Invalid Input");
                    return;
                }
            }
        }
    }
}