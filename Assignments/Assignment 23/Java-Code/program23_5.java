// Accept N mumber from user and return product of all odd elements

import java.util.*;

class Logic
{
    int Product(int Arr[], int iLength)
    {
        int iCnt = 0;
        int iMul = 1;

        for(iCnt = 0; iCnt < iLength; iCnt++)
        {
            if(Arr[iCnt]%2 != 0)
            {
                iMul = iMul*Arr[iCnt];
            } 
        }

        return iMul;
    }
}

class program23_5
{
    public static void main(String A[])
    { 
        Scanner sobj = new Scanner(System.in);
        Logic lobj = new Logic();

        int iSize = 0, iCnt = 0;
        int iRet = 0;
        boolean bRet = false;
        int Arr[];

        System.out.println("Enter number of elements : ");
        iSize = sobj.nextInt();

        Arr = new int[iSize];

        System.out.println("Enter " + iSize + " elements : ");

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            System.out.println("Enter element no " + (iCnt+1) + " : ");
            Arr[iCnt] = sobj.nextInt();
        }

        iRet = lobj.Product(Arr, iSize);

        System.out.println("Product is : " + iRet);
    }
}