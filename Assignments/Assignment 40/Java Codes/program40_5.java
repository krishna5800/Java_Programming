// 5. Write a recursive program which display below pattern.

// Input :  6
// Output : a   b   c   d   e   f

import java.util.*;

class Test
{
    static int iCnt = 'a';

    void Display(int iNo)
    {
        if(iNo >= 1)
        {
            System.out.printf("%c\t", iCnt);
            iCnt++;
            iNo--;
            Display(iNo);               // recursive call
        }
    }
}

class program40_5
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