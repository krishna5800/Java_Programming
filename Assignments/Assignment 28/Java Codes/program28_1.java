/*
Input : iRow = 4        iCol = 4

Output : 
        A   B   C   D
        A   B   C   D
        A   B   C   D
        A   B   C   D
*/

import java.util.*;

class Pattern {
    public void Display(int iRow, int iCol) {
        int i = 0;
        int j = 0;
        char cAlphabet = '\0';

        for (i = 1; i <= iRow; i++) {
            cAlphabet = 65;
            for (j = 1; j <= iCol; j++) {
                System.out.print(cAlphabet + "\t");
                cAlphabet++;
            }
            System.out.println("");
        }
    }
}

class program28_1 {
    public static void main(String A[]) {
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