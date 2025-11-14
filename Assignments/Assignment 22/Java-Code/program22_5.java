// Accept N numbers from user and return frequancy of user defined in it.

import java.util.*;

class Logic
{
    int Check(int Arr[], int iLength, int iValue)
    {
        int iCnt = 0;
        int iCount = 0;

        for(iCnt = 0; iCnt < iLength; iCnt++)
        {
            if(Arr[iCnt] == iValue)
            {
                iCount++;
            }
        }

        return iCount;
    }

}

class program22_5
{
    public static void main(String A[])
    { 
        Scanner sobj = new Scanner(System.in);
        Logic lobj = new Logic();

        int iSize = 0, iCnt = 0, iNo = 0;
        int iRet = 0;
        int Arr[];

        System.out.println("Enter number of elements : ");
        iSize = sobj.nextInt();

        System.out.println("Enter the element whose frequancy you want : ");
        iNo = sobj.nextInt();

        Arr = new int[iSize];

        System.out.println("Enter " + iSize + " elements : ");

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            System.out.println("Enter element no " + iCnt + " : ");
            Arr[iCnt] = sobj.nextInt();
        }

        iRet = lobj.Check(Arr, iSize, iNo);

        System.out.println("Frequency of " + iNo + " is : " + iRet);

    }
}