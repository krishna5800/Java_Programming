// 1. Write a recursive program which display below pattern.
// patttern printintg
// Input :  5
// Output : 5   *   4   *   3   *   2   *   1   *

#include<stdio.h>

void Display(int iNo)
{
    if(iNo >= 1)
    {
        printf("%d\t", iNo);
        printf("*\t");
        iNo--;
        Display(iNo);               // recursive call
    }
}

int main()
{
    int iValue = 0;

    printf("Enter frequency : \n");
    scanf("%d", &iValue);

    Display(iValue);
    
    return 0;
}