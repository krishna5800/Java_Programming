/*
Input : iRow = 4        iCol = 4

Output : 
        A   B   C   D
        a   b   c   d
        A   B   C   D
        a   b   c   d
*/

import java.util.*;

class Pattern {
    public void Display(int iRow, int iCol) {
        int i = 0;
        int j = 0;
        char cCapital = '\0';
        char cSmall = '\0';

        for (i = 1; i <= iRow; i++) {
            cCapital = 65;
            cSmall = 97;
            for (j = 1; j <= iCol; j++) {
                if (i % 2 != 0) {
                    System.out.print(cCapital + "\t");
                    cCapital++;
                } else {
                    System.out.print(cSmall + "\t");
                    cSmall++;
                }
            }
            System.out.println("");
        }
    }
}

class program28_2 {
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