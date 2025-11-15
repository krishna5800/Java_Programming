// Accept N numbers from user and return difference b/w sum of even numbers and sum of odd numbers.

import java.util.*;

class Logic 
{
    int Difference(int Arr[], int iSize)
    {
        int iCnt = 0;
        int iEven = 0;
        int iOdd = 0;

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if(Arr[iCnt]%2 == 0)
            {
                iEven = iEven + Arr[iCnt];
            }
            else
            {
                iOdd = iOdd + Arr[iCnt];
            }
            
        }

        return (iEven-iOdd);
    }
}

class program25_1
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

        iRet = lobj.Difference(Arr, iLength);

        System.out.println("Difference is : " + iRet);

        // Step 3 : Free the allocated memory

        sobj.close();

        System.gc();
    }
}