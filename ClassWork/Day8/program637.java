// iPos = 14
// iMask = 1
// 0000    0000    0000    0000    0000    0000    0000    0001
// iMask = iMask << (iPos - 1)
// 0000    0000    0000    0000    0010    0000    0000    0000
// iMask = ~iMask
// 1111    1111    1111    1111    1101    1111    1111    1111

import java.util.Scanner;

class program637
{
    public static void main(String A[])
    {
        int iNo = 0;
        int iMask = 0x1;  // == 1
        int iPos = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        iNo = sobj.nextInt();

        System.out.println("Enter Position : ");
        iPos = sobj.nextInt();

        iMask = iMask << (iPos - 1);

        iMask = ~iMask;

        iNo = iNo & iMask;

        System.out.println("Updated Number : " + iNo);
    }
}