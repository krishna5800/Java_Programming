// Write a program to find maximum of two numbers.

class Logic
{
    void findMax(int iNo1, int iNo2)
    {
        if(iNo1 > iNo2)
        {
            System.out.println(iNo1 + " is greater than " + iNo2);
        }
        else if(iNo2 > iNo1) 
        {
            System.out.println(iNo2 + " is greater than " + iNo1);
        }
        else
        {
            System.out.println(iNo1 + " is equal to than " + iNo2);
        }
    }
}

class program17_3
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.findMax(20, 15);
    }
}