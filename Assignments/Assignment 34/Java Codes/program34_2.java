// Accept character from user and display its capital if its small , 
// small if it is capital and as it is if its not alphabet 

// INPUT -  G       OUTPUT - g

// INPUT -  g       OUTPUT - G

// INPUT -  4       OUTPUT - 4

// INPUT -  %       OUTPUT - %

import java.util.*;

class Test
{
    void Display(char ch)
    {
        if(ch > 'A' && ch < 'Z')
        {
            System.out.printf("Small is : %c\n", (ch+32));
        }
        else if(ch > 'a' && ch < 'z')
        {
            System.out.printf("Capital is : %c\n", (ch-32));
        }
        else
        {
            System.out.printf("Character is : %c\n", ch);
        }
    }
}

class program34_2
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