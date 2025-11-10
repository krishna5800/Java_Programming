// write a program to print sum of even and odd numbers.

class Logic1
{
    long sumNumberEven(int iNo)
    {
        int i = 0;
        long iSum = 0;

        for (i = 1; i <= iNo; i++) 
        {
            if(i%2 == 0) 
            {
                iSum = iSum + i;
            }
        }
        return iSum;
    }
}

class Logic2 
{
    long sumNumberOdd(int iNo)
    {
        int i = 0;
        long iSum = 0;

        for (i = 1; i <= iNo; i++) 
        {
            if(i%2 != 0) 
            {
                iSum = iSum + i;
            }
        }

        return iSum;
    }
}

class program18_4
{
    public static void main(String[] args) 
    {
        Logic1 lobj1 = new Logic1();
        Logic2 lobj2 = new Logic2();

        long iRet1 = 0;
        iRet1 = lobj1.sumNumberEven(123456);

        long iRet2 = 0;
        iRet2 = lobj1.sumNumberEven(123456);

        System.out.println("Sum of even numbers is : " + iRet1);
        System.out.println("Sum of odd numbers is : " + iRet2);
    }
}