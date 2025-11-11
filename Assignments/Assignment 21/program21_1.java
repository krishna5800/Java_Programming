// Write a program to calculate the product of digits of a number.

class Logic
{
    void productOfDigits(int iNo)
    {
        int iDigit = 0;
        int iProduct = 1;

        while(iNo != 0) 
        {
            iDigit = iNo%10;
            iNo = iNo/10;

            iProduct = iDigit * iProduct;
        }

        System.out.println(iProduct);
    }
}

class program21_1
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.productOfDigits(234);
    }
}