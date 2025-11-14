// Accept N mumber from user and accept one another number as NO check weather NO is 
// present or not

import java.util.*;

class Logic
{
    boolean Check(int Arr[], int iLength, int iValue)
    {
        int iCnt = 0;
        int iCount = 0;
        boolean bAns = false;

        for(iCnt = 0; iCnt < iLength; iCnt++)
        {
            if(Arr[iCnt] == iValue)
            {
                bAns = true;
            }
        }

        return bAns;
    }
}

class program23_1
{
    public static void main(String A[])
    { 
        Scanner sobj = new Scanner(System.in);
        Logic lobj = new Logic();

        int iSize = 0, iCnt = 0;
        int iNo = 0;
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
            System.out.println("Enter element no " + iCnt + " : ");
            Arr[iCnt] = sobj.nextInt();
        }

        bRet = lobj.Check(Arr, iSize, iNo);

        if(bRet == true)
        {
            System.out.println("Number is present");
        }
        else
        {
            System.out.println("Number is not present");
        }

    }
}