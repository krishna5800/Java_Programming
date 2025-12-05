// ACCEPT CHARACTER FORM USER AND CHECK IT IS CAPITAL OR NOT.

// INPUT - F        // OUTPUT - TRUE
// INPUT - d        // OUTPUT - FALSE


import java.util.*;

class CheckX
{
    boolean ChkCapital(char ch)
    {
        if((ch >= 'A' && ch <= 'Z'))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class program33_2
{
    public static void main(String A[]) 
    {
        char cValue = '\0';
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Character : ");

        cValue = sobj.nextLine().charAt(0);       // Important

        CheckX cobj = new CheckX();

        bRet = cobj.ChkCapital(cValue);

        if(bRet == true)
        {
            System.out.println("It is Capital Character\n");
        }
        else
        {
            System.out.println("It is not Capital Character\n");
        }
    }
}