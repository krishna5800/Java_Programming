// Write a program which display ASCII table, table symbols contain decimal, hexadecimal and octal 
// representation of every member from 0 to 255

class Test
{
    void Display()
    {
        int iCnt = 0;

        for(iCnt = 0; iCnt <= 255; iCnt++)
        {
            System.out.printf("%c\t%d\t%x\t%x\t\n", iCnt, iCnt, iCnt, iCnt);
        }
    }
}

class program34_1
{
    public static void main(String A[])
    {
        Test tobj = new Test();

        tobj.Display();
    }
}