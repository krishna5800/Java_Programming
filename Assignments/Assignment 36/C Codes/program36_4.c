// 4. Write a program which accept string from user and display only digits from it.

// Input:  "Marv8ellous890"

// Output: 8890

#include<stdio.h>

void Display(char *str)
{
    while(*str != '\0')
    {
        if(*str >= 48 && *str <= 57)
        {
            printf("%c", *str);
        }

        str++;
    }
}

int main()
{
    char Arr[50] = {'\0'};

    printf("Enter String : \n");
    scanf("%[^'\n']s", Arr);

    Display(Arr);

    return 0;
}