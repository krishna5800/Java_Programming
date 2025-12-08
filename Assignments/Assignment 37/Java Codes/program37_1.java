// 1.Write a program which accept string from user and accept one character. 
// Check whether that character is present in string or not.

// Input : "Marvellous Multi OS"
//         e

// Output: true

// Input:  "Marvellous Multi OS"
//         W

// Output: false

import java.util.Scanner;

class Test
{
    boolean ChkChar(String str, char ch)
    {
        int iCnt = 0;
        boolean bAns = false;

        char Arr[] = str.toCharArray();

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] == ch)
            {
                bAns = true;
                break;
            }
        }

        return bAns;
    }
}

class program37_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        boolean bRet = false;

        System.out.println("Enter String : ");
        String Arr = sobj.nextLine();

        System.out.println("Enter character : ");
        char cValue = sobj.nextLine().charAt(0);

        Test tobj = new Test();

        bRet = tobj.ChkChar(Arr, cValue);

        if(bRet == true)
        {
            System.out.println("Character found");
        }
        else
        {
            System.out.println("Character not found");
        }
    }
}