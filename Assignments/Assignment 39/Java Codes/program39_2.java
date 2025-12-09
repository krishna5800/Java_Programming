// 2. Write a recursive program which display below pattern.

// Output: 1    2   3   4   5

class Test
{
    static int iCnt = 1;

    void Display()
    {
        if(iCnt <= 5)
        {
            System.out.printf("%d\t", iCnt);
            iCnt++;

            Display();      // recursive call
        }
    }
}

class program39_2
{
    public static void main(String A[])
    {
        Test tobj = new Test();

        tobj.Display();
    }
}