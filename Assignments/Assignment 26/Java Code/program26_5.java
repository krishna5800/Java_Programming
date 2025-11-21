// Input : 8
// Output : 2   4   6   8   10  12  14  16

import java.util.*;

class Pattern {
    void Display(int iNo) {
        int iCnt = 0;
        int iTemp = 0;

        for (iCnt = 1; iCnt <= iNo; iCnt++) {
            iTemp = iCnt * 2;
            System.out.print(iTemp + "\t");
        }
    }
}

class program26_5 {
    public static void main(String A[]) {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;

        System.out.println("Enter number of elements : ");
        iValue = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue);
    }
}