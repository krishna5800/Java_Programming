// 5. Write a recursive program which display below pattern.

// Output: a    b   c   d   e   f

class Test
{
    static char iCnt = 'a';

    void Display()
    {
        if(iCnt <= 'f')
        {
            System.out.printf("%c\t", iCnt);
            iCnt++;

            Display();      // recursive call
        }
    }
}

class program39_5
{
    public static void main(String A[])
    {
        Test tobj = new Test();

        tobj.Display();
    }
}