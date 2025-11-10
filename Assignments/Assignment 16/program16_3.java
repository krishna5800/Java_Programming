// Write a program to find factorial of number.(for loop)

class Logic
{
    int findFactorial(int iNo)
    {
        int i  = 0;
        int iFact = 1;

        for(i = 1; i <= iNo; i++)
        {
            iFact = iFact * i;
        }

        return iFact;
    }
}

class program16_3
{
    public static void main(String A[])
    {
        int iAns = 0;

        Logic lobj = new Logic();

        iAns = lobj.findFactorial(5);

        System.out.println("Factorial is : " + iAns);
    }
}