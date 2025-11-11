// Write a program to display all factors of given number.

class Logic
{
    void displayFactors(int iNo)
    {
        int i = 0;

        for(i = 1; i <= iNo/2; i++)
        {
            if (iNo%i == 0) 
            {
                System.out.println(i);
            }
        }
    }
}

class program21_3
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.displayFactors(12);
    }
}