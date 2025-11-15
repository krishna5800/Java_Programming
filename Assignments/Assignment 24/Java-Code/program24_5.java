// Accept N numbers from user and display sumation of digits ofeach number.

import java.util.*;

class Logic 
{
    void DigitsSum(int Arr[], int iSize)
    {
        int iDigit = 0;
        int iNo = 0;
        int iCnt = 0;
        int iSum = 0;

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            iNo = Arr[iCnt];
            iDigit = 0;
            iSum = 0;

            while(iNo != 0)
            {
                iDigit = iNo%10;
                iSum = iSum + iDigit;
                iNo = iNo/10;
            }

            System.out.println(iSum);
        }
    }
}

class program24_5
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

        lobj.DigitsSum(Arr, iLength);

        // Step 3 : Free the allocated memory

        sobj.close();

        System.gc();
    }
}