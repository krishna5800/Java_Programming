// Write a program to find minimum of three numbers.

class Logic
{
    void findMin(int iNo1, int iNo2, int iNo3)
    {
        if(iNo1 < iNo2 && iNo1 < iNo3)
        {
            System.out.println(iNo1 + " is smaller than " + iNo2 + " , " + iNo3);
        }
        else if(iNo2 < iNo1 && iNo2 < iNo3) 
        {
            System.out.println(iNo2 + " is smaller than " + iNo1 + " , " + iNo3);
        }
        else if(iNo1 == iNo2 && iNo1 == iNo3)
        {
            System.out.println("All numbers are equal");
        }
        else
        {
            System.out.println(iNo3 + " is smaller than " + iNo2 + " , " + iNo1);
        }
    }
}

class program17_4
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.findMin(3,7,2);
    }
}