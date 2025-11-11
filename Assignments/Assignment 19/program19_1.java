// Write a program to check the year is leap year or not.

class Logic
{
    boolean checkLeapYear(int iNo)
    {
        if((iNo%4 == 0) && (iNo%100 != 0) || (iNo%400 == 0))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class program19_1
{
    public static void main(String A[])
    {
       boolean bRet = false;

       Logic lobj = new Logic();

       bRet = lobj.checkLeapYear(2024);

       if (bRet == true) 
       {
            System.out.println("Leap Year");
       }
       else
       {
            System.out.println("Not Leap Year");
       }
    }
}