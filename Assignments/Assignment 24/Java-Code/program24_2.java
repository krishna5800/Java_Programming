// Accept N numbers from user and return smallest number.

import java.util.*;

class Logic 
{

    int Minumum(int Arr[], int iSize)
    {
        int iCnt = 0;
        int iMin = 0;

        for(iMin = Arr[0], iCnt = 0; iCnt < iSize; iCnt++)
        {
            if(iMin > Arr[iCnt])
            {
                iMin = Arr[iCnt];
            }
        }

        return iMin;
    }
}

class program24_2
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

        iRet = lobj.Minumum(Arr, iLength);

        System.out.println("Minimum is : " + iRet);

        // Step 3 : Free the allocated memory

        sobj.close();

        System.gc();
    }
}