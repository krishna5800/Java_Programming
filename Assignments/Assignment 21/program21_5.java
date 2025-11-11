// Write a program to print all numbers from 1 to N which are divisible by 2 and 3.

class Logic
{
    void printDivisbleBy2and3(int iNo)
    {
        int i = 0;

        for(i = 1; i <= iNo; i++)
        {
            if(i%2 == 0 && i%3 == 0)
            {
                System.out.println(i);
            }
        }
    }
}

class program21_5
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.printDivisbleBy2and3(30);
    }
}