// 5. Write a recursive program which display below pattern.
// product of digits
// Input :  532
// Output : 30

import java.util.Scanner;

class Test
{
    static int iDigit = 0;
    static int iMul = 1;

    int Display(int iNo)
    {
        if(iNo != 0)
        {
            iDigit = iNo%10;
            iNo = iNo/10;
            iMul = iMul*iDigit;
            Display(iNo);               // recursive call
        }

        return iMul;
    }
}

class program41_5
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