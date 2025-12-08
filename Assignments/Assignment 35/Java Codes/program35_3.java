// Write a program which accepts a string from user and get difference b/w count of small and 
// count of capital letters

import java.util.*;

class Test 
{
    int Difference(String str)
    {
        char Arr[] = str.toCharArray();  // Converted String to Array of character
        int iCnt  = 0; 
        int iCountSmall = 0;
        int iCountCapital = 0;

        for(iCnt = 0; iCnt < Arr.length; iCnt++)        // Important
        {
            if(Arr[iCnt] >= 'a' && Arr[iCnt] <= 'z')
            {
                iCountSmall++;
            }
            else if(Arr[iCnt] >= 'A' && Arr[iCnt] <= 'Z')
            {
                iCountCapital++;
            }
        }

        return (iCountSmall-iCountCapital);
    }
}

class program35_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iRet  = 0;

        System.out.println("Enter String : ");
        String Arr = sobj.nextLine();

        Test tobj = new Test();

        iRet = tobj.Difference(Arr);

        System.out.println("Frequency is : " + iRet);
    }
}