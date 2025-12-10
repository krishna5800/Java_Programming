// 4. Write a recursive program which display below pattern.
// factorial
// Input :  5
// Output : 120

import java.util.Scanner;

class Test
{
    static int iFact = 1;

    int Display(int iNo)
    {
        if(iNo >= 1)
        {
            iFact = iNo*iFact;
            iNo--;
            Display(iNo);               // recursive call 
        }

        return iFact;
    }
}

class program41_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;
        int iRet = 0;

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        Test tobj = new Test();
        iRet = tobj.Display(iValue);

        System.out.println(iRet);
    }
}