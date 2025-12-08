// Accept character from user and display it ASCII decimal, hexadecimal and octal
// INPUT - A
// OUTPUT - 65  0101 0X41

import java.util.*;

class Test
{
    void Display(char ch)
    {
        System.out.printf("%d\n", ch);
        System.out.printf("%x\n", ch);
        System.out.printf("%o\n", ch);
    }
}

class program34_5
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