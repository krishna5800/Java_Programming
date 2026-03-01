import java.util.*;

class program827
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;
        int iDigit = 0;
        int iCount = 0;
        int iPow = 0;
        int iTemp = 0;
        int iArmstrong = 0;

        System.out.println("Enter Number :");
        iNo = sobj.nextInt();

        iTemp = iNo;

        String str = Integer.toString(iNo);
        iCount = str.length();

        while(iTemp != 0)
        {
            iDigit = iTemp % 10;
            iTemp = iTemp / 10;

            // Tried to remove while loop with internal function
            iPow = (int)Math.pow(iDigit, iCount);

            iArmstrong = iArmstrong + iPow;
        }

        if(iArmstrong == iNo)
        {
            System.out.println(iNo + " Is Armstrong Number");
        }
        else
        {
            System.out.println(iNo + " Is Not Armstrong Number");
        }
    }
}