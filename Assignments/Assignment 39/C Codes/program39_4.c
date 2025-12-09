// 4. Write a recursive program which display below pattern.

// Output: A    B   C   D   E   F

#include<stdio.h>

void Display()
{
    static char iCnt = 'A';

    if(iCnt <= 'F')
    {
        printf("%c\t", iCnt);
        iCnt++;

        Display();      // recursive call
    }
}

int main()
{
    Display();
    
    return 0;
}