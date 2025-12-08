// Accept character from user and check weather it is special character or not
// !    @   #   $   %   ^   &   *

// INPUT - D      OUTPUT - FALSE
// INPUT - %      OUTPUT - TRUE

import java.util.*;

class Test
{
    boolean ChkSpecial(char ch)
    {
        if(ch == '!' || ch == '@'  || ch == '#'  || ch == '$' || ch == '%' ||  ch == '^' ||ch == '&' || ch == '*')
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class program34_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        char ch = '\0';
        boolean bRet = false;

        System.out.println("Enter character : ");
        ch = sobj.next().charAt(0);

        Test tobj = new Test();

        bRet = tobj.ChkSpecial(ch);

        if(bRet == true)
        {
            System.out.printf("TRUE\n");
        }
        else
        {
            System.out.printf("FALSE\n");
        }
    }
}