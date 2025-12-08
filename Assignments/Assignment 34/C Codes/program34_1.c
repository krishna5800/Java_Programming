// Write a program which display ASCII table, table symbols contain decimal, hexadecimal and octal 
// representation of every member from 0 to 255

#include<stdio.h>

void DisplayASCII()
{
    int iCnt = 0;

    for(iCnt = 0; iCnt <= 255; iCnt++)
    {
        printf("%c\t%d\t%x\t%x\t\n", iCnt, iCnt, iCnt, iCnt);
    }
}

int main()
{
    DisplayASCII();

    return 0;
}