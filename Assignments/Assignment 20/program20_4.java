// Write a program to find largest digit in given number.

class Logic
{
    void findLargestNumber(int iNo)
    {
        int iDigit = 0;
        int iMax = 0;

        if(iNo < 0) 
        {
            iNo = -iNo;
        }

        while(iNo != 0) 
        {
            iDigit = iNo%10;
            iNo = iNo/10;
            if(iMax < iDigit) 
            {
                iMax = iDigit;
            }
        }

        System.out.println(iMax);
    }
}

class program20_4
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.findLargestNumber(83429);
    }
}