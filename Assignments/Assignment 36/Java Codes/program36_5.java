// 5. Write a program which accept string from user and print count of whitespaces in it.

// Input:  "Marvellous"     "Marvellous Infosystems"

// Output:  0               1

import java.util.Scanner;

class Test 
{
    int CountWhite(String str)
    {
        char Arr[] = str.toCharArray();
        int iCnt = 0;
        int iCount = 0;

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] == ' ')
            {
                iCount++;
            }
        }

        return iCount;
    }
}

class program36_5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iRet = 0;

        System.out.println("Enter String : ");
        String Arr = sobj.nextLine();

        Test tobj = new Test();

        iRet = tobj.CountWhite(Arr);

        System.out.println("Count of white spaces is : " + iRet);
    }
}