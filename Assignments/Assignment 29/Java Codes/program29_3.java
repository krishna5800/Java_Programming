/*
Input : iRow = 5        iCol = 5

Output : 
        a   b   c   d   e
        1   2   3   4   5
        a   b   c   d   e
        1   2   3   4   5
        a   b   c   d   e
*/

import java.util.*;

class Pattern 
{
    public void Display(int iRow, int iCol) 
    {
        int i = 0;
        int j = 0;
        char ch = '\0';

        for (i = 1; i <= iRow; i++) 
        {
            ch = 'a';
            for (j = 1; j <= iCol; j++) 
            {
                if(i%2 != 0) 
                {
                    System.out.print(ch + "\t");
                    ch++;
                }
                else
                {
                    System.out.print(j + "\t");
                }
            }
            System.out.println("");
        }
    }
}

class program29_3
{
    public static void main(String A[]) 
    {
        {
            Scanner sobj = new Scanner(System.in);
            int iValue1 = 0;
            int iValue2 = 0;

            System.out.println("Enter number of rows :");
            iValue1 = sobj.nextInt();

            System.out.println("Enter number of columns :");
            iValue2 = sobj.nextInt();

            Pattern pobj = new Pattern();

            pobj.Display(iValue1, iValue2);
        }
    }
}