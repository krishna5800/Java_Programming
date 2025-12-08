// 1.Write a program which accept string from user and copy that characters of that string 
// in another string in reverse order.

// Input : "Marvellous Multi OS"

// Output: OS itluM suollevraM

#include<stdio.h>

void StrCpyRev(char *str, char *dest)
{
    char *temp1 = NULL;
    char *temp2 = NULL;

    temp1 = str;
    temp2 = dest;

    while(*str != '\0')
    {
        str++;
    }

    str--;

    while(temp1 < str)
    {
        *dest = *str;
        str--;
        dest++;
    }

    *dest = *temp1;
    dest++;
    *dest = '\0';

    printf("%s\n", temp2);
}

int main()
{
    char arr[30] = "Marvellous Python";
    
    char brr[30];

    StrCpyRev(arr, brr);

    return 0;
}