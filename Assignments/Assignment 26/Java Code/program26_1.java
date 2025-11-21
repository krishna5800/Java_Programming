// Input : 5 
// Output : A   B   C   D   E

import java.util.*;

class Pattern {
    void Display(int iNo) {
        int iCnt = 0;
        char iAlphabet = 65; // ASCII OF 'A' IS 65

        for (iCnt = 1; iCnt <= iNo; iCnt++) {
            System.out.print(iAlphabet + "\t");
            iAlphabet++;
        }
    }
}

class program26_1 {
    public static void main(String A[]) {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;

        System.out.println("Enter number of elements : ");
        iValue = sobj.nextInt();

        Pattern pobj = new Pattern();

        pobj.Display(iValue);
    }
}