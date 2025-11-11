// Write a program to calculate sum of all even numbers up to N.

class Logic
{
    void sumEvenNumbers(int iNo)
    {
        int i = 0;
        int iSum  = 0;

        for(i = 1 ; i <= iNo; i++)
        {
            if (i%2 == 0) 
            {
                iSum = iSum + i;
            }
        }

        System.out.println(iSum);
    }
}

class program20_1
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.sumEvenNumbers(10);
    }
}