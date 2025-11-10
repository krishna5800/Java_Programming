// write a program to check if number isprime or not 

class Logic 
{
    boolean checkPrime(int iNo)
    {
        int i = 0;
        boolean bAns = false;
        int iCounter = 0;

        for (i = 2; i < iNo; i++) 
        {
            if(iNo%i == 0)
            {
                iCounter++;
            }
        }

        if(iCounter == 0) 
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class program18_1
{
    public static void main(String[] args) 
    {
        boolean bRet = false;

        Logic lobj = new Logic();
        bRet = lobj.checkPrime(11);

        if(bRet == true) 
        {
            System.out.println("Number is prime");
        }
        else
        {
            System.out.println("Number is not prime");
        }
    }
}