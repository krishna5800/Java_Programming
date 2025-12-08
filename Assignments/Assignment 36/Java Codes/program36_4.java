// 4. Write a program which accept string from user and display only digits from it.

// Input:  "Marv8ellous890"

// Output: 8890

import java.util.Scanner;

class Test 
{
    void Display(String str)
    {
        char Arr[] = str.toCharArray();
        int iCnt = 0;

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] >= '0' && Arr[iCnt] <= '9')
            {
                System.out.printf("%c", Arr[iCnt]);
            }
        }
    }
}

class program36_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        String sRet = null;

        System.out.println("Enter String : ");
        String Arr = sobj.nextLine();

        Test tobj = new Test();

        tobj.Display(Arr);
    }
}