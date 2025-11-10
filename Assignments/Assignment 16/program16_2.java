// Write a program to check number is even or odd

class Logic
{
    boolean checkEvenOdd(int iNo)
    {
        if(iNo%2 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class program16_2
{
    public static void main(String A[])
    {
        boolean bAns = false;

        Logic lobj = new Logic();

        bAns = lobj.checkEvenOdd(7);

        if (bAns == true) 
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
    }
}