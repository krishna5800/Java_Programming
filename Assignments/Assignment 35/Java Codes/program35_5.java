// Write a program which accepts a string from user and display it in reverse order.

import java.util.*;

class Test 
{
    void Difference(String str)
    {
        int iCnt  = 0;
        char Arr[] = str.toCharArray();
        int Counter = Arr.length;

        Counter = Counter - 1;

        for(iCnt = Counter; iCnt >= 0; iCnt--)       
        {
            System.out.printf("%c", Arr[iCnt]);
        }
    }
}

class program35_5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String Arr = sobj.nextLine();

        Test tobj = new Test();

        tobj.Difference(Arr);
    }
}