// Accept N numbers from user and return frequency of even numbers

import java.util.*;

class Logic
{
    int CountEven(int Arr[], int iLength)
    {
    int iCnt = 0;
    int iCount = 0;

    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        if(Arr[iCnt]%2 == 0)
        {
            iCount++;
        }
    }

    return iCount;
    }

}

class program22_1
{
    public static void main(String A[])
    { 
        Scanner sobj = new Scanner(System.in);
        Logic lobj = new Logic();

        int iSize = 0, iCnt = 0, iRet = 0;
        int Arr[];

        System.out.println("Enter number of elements : ");
        iSize = sobj.nextInt();

        Arr = new int[iSize];

        System.out.println("Enter " + iSize + " elements : ");

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            System.out.println("Enter element no " + iCnt + " : ");
            Arr[iCnt] = sobj.nextInt();
        }

        iRet = lobj.CountEven(Arr, iSize);

        System.out.println("Count of even numbers is : " + iRet);

    }
}