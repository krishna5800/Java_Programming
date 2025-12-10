// 1. Write a recursive program which display below pattern.

// Input :  5
// Output : *    *   *   *   *

import java.util.*;

class Test
{
    static int iCnt = 0;

    void Display(int iNo)
    {
        if(iCnt < iNo)
        {
            System.out.printf("*\t");
            iCnt++;
            Display(iNo);               // recursive call
        }
    }
}

class program40_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;

        System.out.println("Enter frequency : ");
        iValue = sobj.nextInt();

        Test tobj = new Test();

        tobj.Display(iValue);
    }
}