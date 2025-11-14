// Accept N numbers from user and return difference b/w frequency of even number and odd number.

import java.util.*;

class Logic
{
    int Frequancy(int Arr[], int iLength)
    {
        int iCnt = 0;
        int iCount1 = 0;
        int iCount2 = 0;

        for(iCnt = 0; iCnt < iLength; iCnt++)
        {
            if(Arr[iCnt]%2 == 0)
            {
                iCount1++;
            }
            else
            {
                iCount2++;
            }
        }

        return (iCount1-iCount2);
    }

}

class program22_2
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

        iRet = lobj.Frequancy(Arr, iSize);

        System.out.println("Difference b/w even and odd is : " + iRet);

    }
}