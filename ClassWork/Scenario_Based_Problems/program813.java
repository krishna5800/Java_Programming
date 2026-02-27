import java.util.*;

class program813
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

        int TotalBooked = 0;
        int MaxBookedInRow = 0;
        int RowWithMax = 0;
        int RowBooked = 0;

        boolean FullRowExists = false;

        for(i = 0; i < R; i++)
        {
            RowBooked = 0;
            for(j = 0; j < C; j++)
            {
                if(Seats[i][j] == 1)
                {
                    TotalBooked++;
                }

                RowBooked = RowBooked + Seats[i][j];
            }

            if(RowBooked > MaxBookedInRow)
            {
                MaxBookedInRow = RowBooked;
                RowWithMax = i;
            }

            if(RowBooked == C)
            {
                FullRowExists = true;
            }
        }

        System.out.println("Total booked seats : " + TotalBooked);
        System.out.println("Row with maximum bookings : " + (RowWithMax+1));
        System.out.println("Full row exists : " + (FullRowExists ? "Yes" : "No"));

        System.out.println("Seat Layout of Theater : ");

        for(i = 0; i < R; i++)
        {
            for(j = 0; j < C; j++)
            {
                System.out.print("\t" + ((Seats[i][j] == 1) ? "Book" : "Free"));
            }

            System.out.println("");
        }
    }
}