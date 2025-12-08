// Write a program which accepts a string from user and display it in reverse order.

#include<stdio.h>

void Reverse(char str[])
{
    char *temp = str;

    while(*str != '\0')
    {
        str++;
    }

    str--;

    while(str >= temp)
    {
        printf("%c", *str);
        str--;
    }
}

int main()
{
    char Arr[50] = {'\0'};

    printf("Enter String : \n");
    scanf("%[^'\n']s", Arr);

    Reverse(Arr);

    return 0;
}