// Accept N mumber from user and accept one another number as NO 
// return index of last occurance of number.

import java.util.*;

class Logic
{
    int LastOcc(int Arr[], int iLength, int iValue)
    {
        int iCnt = 0;
        int iOccurance = -1;

        for(iCnt = 0; iCnt < iLength; iCnt++)
        {
            if(Arr[iCnt] == iValue)
            {
                iOccurance = iCnt;
            }
        }

        return iOccurance;
    }
}

class program23_3
{
    public static void main(String A[])
    { 
        Scanner sobj = new Scanner(System.in);
        Logic lobj = new Logic();

        int iSize = 0, iCnt = 0;
        int iNo = 0;
        int iRet = 0;
        boolean bRet = false;
        int Arr[];

        System.out.println("Enter number of elements : ");
        iSize = sobj.nextInt();

        System.out.println("Enter the element you want : ");
        iNo = sobj.nextInt();

        Arr = new int[iSize];

        System.out.println("Enter " + iSize + " elements : ");

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            System.out.println("Enter element no " + (iCnt+1) + " : ");
            Arr[iCnt] = sobj.nextInt();
        }

        iRet = lobj.LastOcc(Arr, iSize, iNo);

        if(iRet == -1)
        {
            System.out.println("There is no such number");
        }
        else
        {
            System.out.println("First occurence of number is : " + iRet);
        }
    }
}