import java.util.*;

class program833
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;
        int iTemp = 0;
        int iDigit = 0;
        int iMult = 0;
        int iSum = 0;

        System.out.println("Enter Number : ");
        iNo = sobj.nextInt();

        iMult = 1;
        iTemp = iNo;

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            iSum = iSum + iDigit;
            iMult = iMult * iDigit;

            iNo = iNo / 10;
        }

        if(iSum == iMult)
        {
            System.out.println(iTemp + " is a Spy number");
        }
        else
        {
            System.out.println(iTemp + " is not a Spy number");
        }
    }
}