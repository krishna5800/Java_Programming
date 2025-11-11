// Write a program to check weather a number is divisible by 5 and 11 or not. 

class Logic
{
    boolean checkDivisible(int iNo)
    {
        if((iNo%5 == 0) && (iNo%11 == 0))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class program19_3
{
    public static void main(String A[])
    {
        boolean bRet = false;
        Logic lobj = new Logic();
        bRet = lobj.checkDivisible(55);


        if(bRet == true) 
        {
            System.out.println("Number is divisible by 11 and 5");
        }
        else
        {
            System.out.println("Number is not divisible by 11 and 5");
        }
    }
}