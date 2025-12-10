// 3. Write a recursive program which display below pattern.

// Input :  5
// Output : 5   4   3   2   1

import java.util.*;

class Test
{
    static int iCnt = 0;

    void Display(int iNo)
    {
        if(iNo >= 1)
        {
            System.out.printf("%d\t", iNo);
            iNo--;
            Display(iNo);               // recursive call
        }
    }
}

class program40_3
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