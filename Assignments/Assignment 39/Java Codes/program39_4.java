// 4. Write a recursive program which display below pattern.

// Output: A    B   C   D   E   F

class Test
{
    static char iCnt = 'A';

    void Display()
    {
        if(iCnt <= 'F')
        {
            System.out.printf("%c\t", iCnt);
            iCnt++;

            Display();      // recursive call
        }
    }
}

class program39_4
{
    public static void main(String A[])
    {
        Test tobj = new Test();

        tobj.Display();
    }
}