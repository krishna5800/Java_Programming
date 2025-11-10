// Write a program to reverse number.

class Logic
{
    void reverseNumber(int iNo)
    {
        int iDigit  = 0;

        while (iNo != 0)
        {
            iDigit = iNo%10;
            System.out.println(iDigit);
            iNo = iNo/10;
        }
    }
}

class program16_4   
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.reverseNumber(1234);
    }
}