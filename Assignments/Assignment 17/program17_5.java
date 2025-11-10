// Write a program to print multiplication table of a number.

class Logic
{
    void printTable(int iNo)
    {
        int i = 0;

        for(i = 1; i <= 10; i++)
        {
            System.out.println(i + " * " + iNo + " = " + (iNo*i));
        }
    }
}

class program17_5
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.printTable(5);
    }
}