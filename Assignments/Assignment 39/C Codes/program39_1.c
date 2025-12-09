// 1. Write a recursive program which display below pattern.

// Output: *    *   *   *   *

#include<stdio.h>

void Display()
{
    static int iCnt = 0;

    if(iCnt < 5)
    {
        printf("*\t");
        iCnt++;

        Display();      // recursive call
    }
}

int main()
{
    Display();

    return 0;
}