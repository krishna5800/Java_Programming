// Write a program to check weatherthe number is palindrome or not.

class Logic
{
    boolean checkPalindrome(int iNo)
    {
        int iDigit = 0;
        int iTemp = iNo;
        int iNo1 = 0;

        while(iNo != 0) 
        {
            iDigit = iNo%10;
            iNo1 = (10*iNo1) + iDigit;
            iNo = iNo/10;
        }

        if(iNo1 == iTemp) 
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class program17_2
{
    public static void main(String A[])
    {
        boolean bAns = false;

        Logic lobj = new Logic();
        bAns = lobj.checkPalindrome(121);

        if (bAns == true) 
        {
            System.out.println("Is palindrome");
        }
        else
        {
            System.out.println("Is not palindrome");
        }
    }
}