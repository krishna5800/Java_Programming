// Write a program which accepts a string from user and count number of capital characters.

import java.util.*;

class Test 
{
    int CountCapital(String str)
    {
        char Arr[] = str.toCharArray();  // converted String to Array of character
        int iCnt  = 0; 
        int iCount = 0;

        for(iCnt = 0; iCnt < Arr.length; iCnt++)        // Important
        {
            if(Arr[iCnt] >= 'A' && Arr[iCnt] <= 'Z')
            {
                iCount++;
            }
        }

        return iCount;
    }
}

class program35_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iRet  = 0;

        System.out.println("Enter String : ");
        String Arr = sobj.nextLine();

        Test tobj = new Test();

        iRet = tobj.CountCapital(Arr);

        System.out.println("Count of Capital letters is : " + iRet);
    }
}