// 3. Write a recursive program which display below pattern.
// count of string (string length)
// Input :  Hello
// Output : 5

import java.util.Scanner;

class Test
{
    static int iCnt = 0;

    int Display(String str)
    {
        char Arr[] = str.toCharArray();

        if(iCnt < Arr.length)
        {
            iCnt++;
            Display(str);
        }

        return iCnt;
    }
}

class program41_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        String Arr = null;
        int iRet = 0;

        System.out.println("Enter String : ");
        Arr = sobj.nextLine();

        Test tobj = new Test();
        iRet = tobj.Display(Arr);

        System.out.println(iRet);
    }
}