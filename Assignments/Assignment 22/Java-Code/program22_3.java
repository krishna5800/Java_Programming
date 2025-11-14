// Accept N numbers from user and check weather that numbers contain 11 in it or not

import java.util.*;

class Logic
{
    boolean Check(int Arr[], int iLength)
    {
        int iCnt = 0;
        boolean bAns = false;

        for(iCnt = 0; iCnt < iLength; iCnt++)
        {
            if(Arr[iCnt] == 11)
            {
                bAns = true;
            }
        }

        return bAns;
    }

}

class program22_3
{
    public static void main(String A[])
    { 
        Scanner sobj = new Scanner(System.in);
        Logic lobj = new Logic();

        int iSize = 0, iCnt = 0;
        boolean bRet = false;
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

        bRet = lobj.Check(Arr, iSize);

        if(bRet == true) 
        {
            System.out.println("11 is present");
        }
        else
        {
            System.out.println("11 is absent");
        }

    }
}