// Write a program to find how many even and odd numbers are in b/w 1 to N

class Logic
{
    void countEvenOddRange(int iNo)
    {
        int i = 0;
        int iCount1 = 0;
        int iCount2 = 0;

        for(i = 1; i <= iNo; i++)
        {
            if (i%2 == 0) 
            {
                iCount1++;    
            }
        }

        for(i = 1; i <= iNo; i++)
        {
            if (i%2 != 0) 
            {
                iCount2++;    
            }
        }

        System.out.println("Even numbers are : " + iCount1);
        System.out.println("Odd numbers are : " + iCount2);
    }
}

class program21_2
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.countEvenOddRange(50);
    }
}