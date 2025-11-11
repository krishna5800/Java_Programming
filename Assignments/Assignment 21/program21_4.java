// Write a program to display all count factors of given number.

class Logic
{
    void countFactors(int iNo)
    {
        int i = 0;
        int iCount = 0;

        for(i = 1; i <= iNo/2; i++)
        {
            if (iNo%i == 0) 
            {
                iCount++;
            }
        }

        System.out.println(iCount);
    }
}

class program21_4
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.countFactors(20);
    }
}