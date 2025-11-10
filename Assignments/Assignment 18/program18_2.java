// write a program to print all even numbers upto N.

class Logic 
{
    void printEven(int iNo)
    {
        int i = 0;
        int iAns = 0;

        for (i = 2; i < iNo; i++) 
        {
            iAns = iAns + 2;
            if(iNo < iAns) 
            {
                break;
            }
            System.out.print(iAns + "     ");
        }
    }
}

class program18_2
{
    public static void main(String[] args) 
    {
        Logic lobj = new Logic();
        lobj.printEven(20);
    }
}