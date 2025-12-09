// 1. Write a recursive program which display below pattern.

// Output: *    *   *   *   *

class Test
{
    static int iCnt = 0;

    void Display()
    {
        if(iCnt < 5)
        {
            System.out.printf("*\t");
            iCnt++;

            Display();      // recursive call
        }
    }
}

class program39_1
{
    public static void main(String A[])
    {
        Test tobj = new Test();

        tobj.Display();
    }
}