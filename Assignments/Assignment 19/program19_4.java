// Write a program to print each number of number seperately.

class Logic
{
    void printDigits(int iNo)
    {
        int iDigit = 0;
        
        while(iNo != 0) 
        {
            iDigit = iNo%10;
            System.out.println(iDigit);
            iNo = iNo/10;
        }
    }
}

class program19_4
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.printDigits(9876);
    }
}