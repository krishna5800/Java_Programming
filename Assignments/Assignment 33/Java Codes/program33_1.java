// ACCEPT CHARACTER FORM USER AND CHECK IT IS ALPHABET OR NOT .

// INPUT - F        // OUTPUT - TRUE
// INPUT - &        // OUTPUT - FALSE

import java.util.*;

class CheckX
{
    boolean ChkAlpha(char ch)
    {
        if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class program33_1
{
    public static void main(String A[]) 
    {
        char cValue = '\0';
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Character : ");

        cValue = sobj.nextLine().charAt(0);       // Important

        CheckX cobj = new CheckX();

        bRet = cobj.ChkAlpha(cValue);

        if(bRet == true)
        {
            System.out.println("It is Character");
        }
        else
        {
            System.out.println("It is not a Character");
        }
    }
}