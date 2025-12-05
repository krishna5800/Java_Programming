// ACCEPT CHARACTER FORM USER AND CHECK IT IS DIGIT OR NOT.

// INPUT - 7        // OUTPUT - TRUE
// INPUT - d        // OUTPUT - FALSE


import java.util.*;

class CheckX
{
    boolean ChkDigit(char ch)
    {
        if((ch >= 48 && ch <= 57))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class program33_3
{
    public static void main(String A[]) 
    {
        char cValue = '\0';
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Character : ");

        cValue = sobj.nextLine().charAt(0);       // Important

        CheckX cobj = new CheckX();

        bRet = cobj.ChkDigit(cValue);

        if(bRet == true)
        {
            System.out.println("It is Digit\n");
        }
        else
        {
            System.out.println("It is not Digit\n");
        }
    }
}