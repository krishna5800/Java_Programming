// Accept N mumber from user and accept one range
// display all elements in range 

import java.util.*;

class Logic
{
    void Range(int Arr[], int iLength, int iValue1, int iValue2)
    {
        int iCnt = 0;

        for(iCnt = 0; iCnt < iLength; iCnt++)
        {
            if(Arr[iCnt] > iValue1 && Arr[iCnt] < iValue2)
            {
                System.out.print(Arr[iCnt] + "  ");
            }
        }
    }
}

class program23_4
{
    public static void main(String A[])
    { 
        Scanner sobj = new Scanner(System.in);
        Logic lobj = new Logic();

        int iSize = 0, iCnt = 0;
        int iNo1 = 0, iNo2 = 0;
        int iRet = 0;
        boolean bRet = false;
        int Arr[];

        System.out.println("Enter number of elements : ");
        iSize = sobj.nextInt();

        System.out.println("Enter the 1st element : ");
        iNo1 = sobj.nextInt();

        System.out.println("Enter the last element : ");
        iNo2 = sobj.nextInt();

        Arr = new int[iSize];

        System.out.println("Enter " + iSize + " elements : ");

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            System.out.println("Enter element no " + (iCnt+1) + " : ");
            Arr[iCnt] = sobj.nextInt();
        }

        lobj.Range(Arr, iSize, iNo1, iNo2);
    }
}