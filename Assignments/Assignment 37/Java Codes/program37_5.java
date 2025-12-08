// 5. Write a program which accept string from user reverse that string in place.

// Input:       "abcd"

// Output:      "dcba"

// Input:       "abba"

// Output:      "abba"

import java.util.Scanner;

class Test
{
    String strrevX(String str)
    {
        char Arr[] = str.toCharArray();
        int iCnt = 0;
        int reverse = 0;

        char rev[] = new char[Arr.length];

        for(iCnt = (Arr.length-1), reverse = 0; iCnt >= 0; iCnt--, reverse++)
        {
            rev[reverse] = Arr[iCnt];
        }

        return new String(rev);
    }
}

class program37_5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String Arr = sobj.nextLine();

        Test tobj = new Test();

        Arr = tobj.strrevX(Arr);

        System.out.println(Arr);
    }
}