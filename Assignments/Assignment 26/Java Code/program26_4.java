// Input : 4
// Output : #   1   *   #   2   *   #   3   *   #   4   *

import java.util.*;

class Pattern {
    void Display(int iNo) {
        int iCnt = 0;

        for (iCnt = 1; iCnt <= iNo; iCnt++) {
            System.out.print("#\t" + iCnt + "\t" + "*\t");
        }
    }
}

class program26_4 {
    public static void main(String A[]) {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;

        System.out.println("Enter number of elements : ");
        iValue = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue);
    }
}