// Accept N numbers from user and display all numbers which contains 3 digits in it.

import java.util.*;

class Logic 
{
    void Digits(int Arr[], int iSize)
    {
        int iDigit = 0;
        int iNo = 0;
        int iCnt = 0;

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            iNo = Arr[iCnt];
            iDigit = 0;

            while(iNo != 0)
            {
                iDigit++;
                iNo = iNo/10;
            }

            if(iDigit == 3)
            {
                System.out.println(Arr[iCnt]);
            }
        }
    }
}

class program24_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        Logic lobj = new Logic();
        int iLength = 0;
        int iCnt = 0;

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

        lobj.Digits(Arr, iLength);

        // Step 3 : Free the allocated memory

        sobj.close();

        System.gc();
    }
}