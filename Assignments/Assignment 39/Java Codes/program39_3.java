// 3. Write a recursive program which display below pattern.

// Output: 5    4   3   2   1

class Test
{
    static int iCnt = 5;

    void Display()
    {
        if(iCnt >= 1)
        {
            System.out.printf("%d\t", iCnt);
            iCnt--;

            Display();      // recursive call
        }
    }
}

class program39_3
{
    public static void main(String A[])
    {
        Test tobj = new Test();

        tobj.Display();
    }
}