// 4. Write a recursive program which display below pattern.
// factorial
// Input :  5
// Output : 120

#include<stdio.h>

int Display(int iNo)
{
    static int iFact = 1;

    if(iNo >= 1)
    {
        iFact = iNo*iFact;
        iNo--;
        Display(iNo);               // recursive call 
    }

    return iFact;
}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter Number : \n");
    scanf("%d", &iValue);

    iRet = Display(iValue);

    printf("%d\n", iRet);
    
    return 0;
}