import java.util.*;

class program830
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;
        int iDigit = 0;
        int iTemp = 0;
        int iRev = 0;

        System.out.println("Enter Number : ");
        iNo = sobj.nextInt();

        iTemp = iNo;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iRev = iRev * 10 + iDigit;
            iNo = iNo /10;
        }

        if(iTemp == iRev)
        {
            System.out.println(iTemp + " is palindrome numner");
        }
        else
        {
            System.out.println(iTemp + " is not palindrome numner");
        }
    }
}