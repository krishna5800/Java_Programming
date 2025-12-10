// 4. Write a recursive program which display below pattern.

// Input :  6
// Output : A   B  C    D   E   F

#include<stdio.h>

void Display(int iNo)
{
    static char iCnt = 'A';

    if(iNo >= 1)
    {
        printf("%c\t", iCnt);
        iCnt++;
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