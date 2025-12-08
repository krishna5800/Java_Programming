// 4. Write a program which accept string from user and copy that characters of that 
// string into another string by converting all capital characters into small case.

// Input: "Marvellous Python 2"

// Output: "marvellous python 2"

#include<stdio.h>

void StrCpySmall(char *str, char *dest)
{
    char *temp = NULL;
    temp = dest;

    while(*str != '\0')
    {
        if(*str >= 'A' && *str <= 'Z')
        {
            *dest = *str + (char)(32); 
        }
        else
        {
            *dest = *str;
        }

        str++;
        dest++;
    }

    *dest = '\0';

    printf("%s\n", temp);
}

int main()
{
    char arr[30] = "Marvellous Python 2";
    
    char brr[30];

    StrCpySmall(arr, brr);

    return 0;
}