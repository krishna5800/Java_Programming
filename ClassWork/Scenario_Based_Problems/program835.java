import  java.util.*;

class program835
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;
        int Ans = 0;

        System.out.println("Enter Number : ");
        iNo = sobj.nextInt();

        iNo++;

        Ans = (int)Math.sqrt(iNo);

        if(Ans*Ans == iNo)
        {
            System.out.println(--iNo + " is sunny number");
        }
        else
        {
            System.out.println(--iNo + " is not sunny number");
        }
    }
}