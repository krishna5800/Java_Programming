// ACCEPT CHARACTER FORM USER AND CHECK IT IS SMALL OR NOT.

// INPUT - g        // OUTPUT - TRUE
// INPUT - D        // OUTPUT - FALSE


import java.util.*;

class CheckX
{
    boolean ChkSmall(char ch)
    {
        if((ch >= 'a' && ch <= 'z'))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class program33_4
{
    public static void main(String A[]) 
    {
        char cValue = '\0';
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Character : ");

        cValue = sobj.nextLine().charAt(0);       // Important

        CheckX cobj = new CheckX();

        bRet = cobj.ChkSmall(cValue);

        if(bRet == true)
        {
            System.out.println("It is Small Character\n");
        }
        else
        {
            System.out.println("It is not Small Character\n");
        }
    }
}