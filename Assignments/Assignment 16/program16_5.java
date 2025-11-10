// Write a program to count number of digits in a given number.

class Logic
{
    int countNumber(int iNo)
    {
        int iDigit  = 0;
        int iCount = 0;

        while (iNo != 0)
        {
            iDigit = iNo%10;
            iNo = iNo/10;
            iCount++;
        }

        return iCount;
    }
}

class program16_5
{
    public static void main(String A[])
    {
        int iAns = 0;

        Logic lobj = new Logic();
        iAns = lobj.countNumber(7865);

        System.out.println("Numbers are : " + iAns);
    }
}