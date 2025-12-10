// 1. Write a recursive program which display below pattern.
// patttern printintg
// Input :  5
// Output : 5   *   4   *   3   *   2   *   1   *

import java.util.Scanner;

class Test
{
    void Display(int iNo)
    {
        if(iNo >= 1)
        {
            System.out.printf("%d\t", iNo);
            System.out.printf("*\t");
            iNo--;
            Display(iNo);               // recursive call
        }
    }

}

class program41_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        Test tobj = new Test();

        tobj.Display(iValue);
    }
}