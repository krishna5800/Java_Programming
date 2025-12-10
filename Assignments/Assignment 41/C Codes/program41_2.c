// 2. Write a recursive program which display below pattern.
// sum of all digits
// Input :  879
// Output : 24

#include<stdio.h>

int Display(int iNo)
{
    static int iDigit = 0;
    static int iSum = 0;

    if(iNo != 0)
    {
        iDigit = iNo%10;
        iNo = iNo/10;
        iSum = iSum + iDigit;
        Display(iNo);               // recursive call
    }


    return iSum;
}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter frequency : \n");
    scanf("%d", &iValue);

    iRet = Display(iValue);

    printf("%d\n", iRet);
    
    return 0;
}