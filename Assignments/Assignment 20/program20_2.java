// Write a program to print number in reverse from N.

class Logic
{
    void printReverse(int iNo)
    {
        int i = 0;

        for(i = iNo; i > 0; i--)
        {
            System.out.println(i);
        }
    }
}

class program20_2
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.printReverse(10);
    }
}