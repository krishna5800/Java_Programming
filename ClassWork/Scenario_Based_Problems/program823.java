import java.util.*;

class program823
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;
        int iDigit = 0;
        int iCount = 0;
        int iPow = 0;
        int iTemp = 0;
        int iCountTemp = 0;
        int iArmstrong = 0;

        System.out.println("Enter Number :");
        iNo = sobj.nextInt();

        iTemp = iNo;

        // Count number of digits

        while(iTemp != 0)
        {
            iCount++;
            iTemp = iTemp / 10;
        }

        iTemp = iNo;
        iCountTemp = iCount;

        while(iTemp != 0)
        {
            iCount = iCountTemp;
            iPow = 1;
            iDigit = iTemp % 10;
            iTemp = iTemp / 10;

            // count power
            while(iCount != 0)
            {
                iPow = iPow * iDigit;
                iCount--;
            }

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