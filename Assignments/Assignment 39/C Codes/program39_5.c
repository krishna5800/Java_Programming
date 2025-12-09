// 5. Write a recursive program which display below pattern.

// Output: a    b   c   d   e   f

#include<stdio.h>

void Display()
{
    static char iCnt = 'a';

    if(iCnt <= 'f')
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