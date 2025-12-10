// 2. Write a recursive program which display below pattern.
// sum of all digits
// Input :  879
// Output : 24

import java.util.Scanner;

class Test
{
    static int iDigit = 0;
    static int iSum = 0;

    int Display(int iNo)
    {
        if(iNo != 0)
        {
            iDigit = iNo%10;
            iNo = iNo/10;
            iSum = iSum + iDigit;
            Display(iNo);               // recursive call
        }

        return iSum;
    }
}

class program41_2
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