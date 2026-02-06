// 4th bit OFF
// 1111     1111    1111     1111    1111    1111    1111    0111
// 0xfffffff7

import java.util.Scanner;

class program635
{
    public static void main(String A[])
    {
        int iNo = 0;
        int iMask = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        iNo = sobj.nextInt();

        iMask = 0xfffffff7;

        iNo = iNo & iMask;


        System.out.println("Updated Number : " + iNo);
    }
}