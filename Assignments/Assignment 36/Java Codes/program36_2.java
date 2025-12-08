// 2. Write a program which accept string from user and convert it into upper case.

// Input:  "Marvellous Multi OS"

// Output: MARVELLOUS MULTI OS

import java.util.Scanner;

class Test 
{
    String struprx(String str)
    {
        char Arr[] = str.toCharArray();
        int iCnt = 0;

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] >= 'a' && Arr[iCnt] <= 'z')
            {
                Arr[iCnt] = (char)(Arr[iCnt] - 32);
            }
        }

        return new String(Arr);
    }
}

class program36_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        String sRet = null;

        System.out.println("Enter String : ");
        String Arr = sobj.nextLine();

        Test tobj = new Test();

        sRet = tobj.struprx(Arr);

        System.out.println("Modified string is : " + sRet);
    }
}