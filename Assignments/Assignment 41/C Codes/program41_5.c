// 5. Write a recursive program which display below pattern.
// product of digits
// Input :  532
// Output : 30

#include<stdio.h>

int Display(int iNo)
{
    static int iDigit = 0;
    static int iMul = 1;

    if(iNo != 0)
    {
        iDigit = iNo%10;
        iNo = iNo/10;
        iMul = iMul*iDigit;
        Display(iNo);               // recursive call
    }


    return iMul;
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