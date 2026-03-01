import java.util.*;

class program828
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;
        int iDigit = 0;
        int iSum = 0;
        int iTemp = 0;

        System.out.println("Enter Number : ");
        iNo = sobj.nextInt();

        iTemp = iNo;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iNo = iNo /10;

            iSum = iSum + iDigit;
        }

        if(iTemp % iSum == 0)
        {
            System.out.println(iTemp + " is Harshad Number");
        }
        else
        {
            System.out.println(iTemp + " is not Harshad Number");
        }
    }
}