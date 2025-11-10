// write a program to check weather number is positive, negative or zero.

class Logic
{
    void checkNumber(int iNo)
    {
        if(iNo > 0)
        {
            System.out.println("Positive");
        }
        else if (iNo < 0) 
        {
            System.out.println("Negative");
        }
        else
        {
            System.out.println("Is Zero");
        }
    }
}

class program18_5
{
    public static void main(String[] args) 
    {
        Logic lobj = new Logic();
        lobj.checkNumber(-8);
    }
}