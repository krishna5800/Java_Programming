// Write a program to check number is perfect number or not.

class Logic
{
    void checkPerfect(int iNo)
    {
        int i = 0;
        int iSum = 0;

        for(i = 1; i <= iNo/2; i++)
        {
            if (iNo%i == 0)
            {
                iSum = iSum + i;
            }
        }

        if(iSum == iNo) 
        {
            System.out.println("Is perfect number");
        }
        else
        {
            System.out.println("Is not a perfect number");
        }
    }
}

class program20_3
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.checkPerfect(6);
    }
}