// Accept N numbers from user and display all such elements which are divisible by 3 and 5.

import java.util.*;

class Logic 
{
    void Display(int Arr[], int iSize)
    {
        int iCnt = 0;

        System.out.println("Result is : ");

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if(Arr[iCnt]%5 == 0 && Arr[iCnt]%3 == 0)
            {
                System.out.println(Arr[iCnt]);
            } 
        }
    }
}

class program25_4
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

        lobj.Display(Arr, iLength);

        // Step 3 : Free the allocated memory

        sobj.close();

        System.gc();
    }
}