import java.util.*;

class program799
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Units = 0;
        int Amount = 0;

        System.out.println("Enter Units : ");
        Units = sobj.nextInt();

        if(Units < 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        if(Units > 0 && Units <= 100)
        {
            Amount = Units * 5;
        }
        else if(Units > 100 && Units <= 200)
        {
            Amount = (100*5) + (Units - 100) * 7;
        }
        else if(Units > 200)
        {
            Amount = 100*5 + 100*7 + (Units-200) * 10;
        }

        System.out.println("Total Units Consumed : " + Units);
        System.out.println("Total Electricity Bill : " + Amount);
    }
}