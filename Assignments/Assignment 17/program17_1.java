// Write a program to find the sum of digits of number.

class Logic
{
    int sumofNumber(int iNo)
    {
        int iDigit  = 0;
        int iSum = 0;

        while (iNo != 0)
        {
            iDigit = iNo%10;
            iNo = iNo/10;
            iSum = iSum + iDigit;
        }

        return iSum;
    }
}

class program17_1
{
    public static void main(String A[])
    {
        int iAns = 0;

        Logic lobj = new Logic();
        iAns = lobj.sumofNumber(1234);

        System.out.println("Sum of Numbers is :" + iAns);
    }
}