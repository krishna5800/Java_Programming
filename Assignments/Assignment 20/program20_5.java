// Write a program to find smallest digit in given number.

class Logic
{
    void findLargestNumber(int iNo)
    {
        int iDigit = 0;
        int iMax = 9;

        if(iNo < 0) 
        {
            iNo = -iNo;
        }

        while(iNo != 0) 
        {
            iDigit = iNo%10;
            iNo = iNo/10;
            if(iMax > iDigit) 
            {
                iMax = iDigit;
            }
        }

        System.out.println(iMax);
    }
}

class program20_5
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.findLargestNumber(45872);
    }
}