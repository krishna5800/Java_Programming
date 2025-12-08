// 3.Write a program which accept string from user and accept one character. 
// and return index of first occurance of that character.

// Input : "Marvellous Multi OS"
//         M

// Output: 0

// Input:  "Marvellous Multi OS"
//         W

// Output: -1

import java.util.Scanner;

class Test
{
    int FirstChar(String str, char ch)
    {
        int iCnt = 0;
        int iCount = -1;

        char Arr[] = str.toCharArray();

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] == ch)
            {
                return iCnt;
            }
        }

        return iCount;
    }
}

class program37_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iRet = 0;

        System.out.println("Enter String : ");
        String Arr = sobj.nextLine();

        System.out.println("Enter character : ");
        char cValue = sobj.nextLine().charAt(0);

        Test tobj = new Test();

        iRet = tobj.FirstChar(Arr, cValue);

        System.out.println(iRet);
    }
}