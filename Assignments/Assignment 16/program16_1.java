// Write a program to calculate sum of first N natural numbers

class Logic
{
    int calculateSum(int iNo)
    {
        int i = 0;
        int iSum = 0;

        for(i = 1; i <= iNo; i++)
        {
            iSum = iSum+i;
        }

        return iSum;
    }
}

class program16_1
{
    public static void main(String A[])
    {
        int iAns = 0;

        Logic lobj = new Logic();
        iAns = lobj.calculateSum(10);


        System.out.println("Sum is :" +iAns);

    }
}