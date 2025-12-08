// Accept character from user and display its capital display all alphabtes from that to 'Z'
// if its small display all alphabets in reverse from that to 'a'
// in other cases return directly 

import java.util.*;

class Test
{
    void Display(char ch)
    {
        char c = '\0';

        if(ch >= 'A' && ch <= 'Z')
        {
            for(c = ch; c <= 'Z'; c++)
            {
                System.out.printf("%c\t", c);
            }
        }
        else if(ch >= 'a' && ch <= 'z')
        {
            for(c = ch; c <= 'z'; c++)
            {
                System.out.printf("%c\t", c);
            }
        }
        else
        {
            return ;
        }
    }
}

class program34_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        char ch = '\0';

        System.out.println("Enter character : ");
        ch = sobj.next().charAt(0);

        Test tobj = new Test();

        tobj.Display(ch);
    }
}