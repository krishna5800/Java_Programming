// write a program to print all odd numbers upto N.

class Logic 
{
    void printOdd(int iNo)
    {
        int i = 0;
        int iAns = 0;

        for (i = 1; i <= iNo; i++) 
        {
            if(i%2 != 0) 
            {
                System.out.print(i + "    ");
            }
        }
    }
}

class program18_3
{
    public static void main(String[] args) 
    {
        Logic lobj = new Logic();
        lobj.printOdd(20);
    }
}