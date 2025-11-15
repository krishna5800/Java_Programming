// Accept N numbers from user and return fifference b/w largest and smallest number.

import java.util.*;

class Logic 
{

    int MaxMinDiff(int Arr[], int iSize)
    {
        int iCnt = 0;
        int iMin = 0;
        int iMax = 0;

        for(iMin = Arr[0], iCnt = 0; iCnt < iSize; iCnt++)
        {
            if(iMin > Arr[iCnt])
            {
                iMin = Arr[iCnt];
            }
        }

        for(iMax = Arr[0], iCnt = 0; iCnt < iSize; iCnt++)
        {
            if(iMax < Arr[iCnt])
            {
                iMax = Arr[iCnt];
            }
        }

        return (iMax - iMin);
    }
}

class program24_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        Logic lobj = new Logic();
        int iLength = 0;
        int iCnt = 0;
        int iRet = 0;

        System.out.println("Enter number of elements : ");
        iLength = sobj.nextInt();

        // Step 1 : Allocate memory

        int Arr[] = new int[iLength];

        System.out.println("Enter " + iLength + " elements :");

        // Step 2 : Use the allocated memory

        for(iCnt = 0; iCnt < iLength; iCnt++)
        {
            System.out.println("Enter element " + (iCnt+1) + " : ");
            Arr[iCnt] = sobj.nextInt();
        }

        iRet = lobj.MaxMinDiff(Arr, iLength);

        System.out.println("Difference b/w largets and smallest number is : " + iRet);

        // Step 3 : Free the allocated memory

        sobj.close();

        System.gc();
    }
}