// 2. Write a program which accept string from user and copy that characters of that string 
// into another string by removing all white spaces.

// Input:   "Marvel lous Pyth on"
// Output:  MarvellousPython

#include<stdio.h>

void StrCpyX(char *str, char *dest)
{
    char *temp = NULL;
    temp = dest;

    while(*str != '\0')
    {
        if(*str != ' ')
        {
            *dest = *str;
            dest++;
        }
        str++;
    }

    *dest = '\0';

    printf("%s\n", temp);
}

int main()
{
    char arr[30] = "Marvel lous Pyth on";
    
    char brr[30];

    StrCpyX(arr, brr);

    return 0;
}