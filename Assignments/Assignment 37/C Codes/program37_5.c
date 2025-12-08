// 5. Write a program which accept string from user reverse that string in place.

// Input:       "abcd"

// Output:      "dcba"

// Input:       "abba"

// Output:      "abba"

#include<stdio.h>

void strrevX(char *str)
{
    char temp = '\0';
    char *start = str;
    char *end = str;

    while(*end != '\0')
    {
        end++;
    }

    end--;

    while(start < end)
    {
        temp = *start;
        *start = *end;
        *end = temp;

        end--;
        start++;
    }
}

int main()
{
    char Arr[50] = {"\0"};

    printf("Enter String : \n");
    scanf("%[^'\n']", Arr);

    strrevX(Arr);

    printf("Modifies string is : %s\n", Arr);

    return 0;
}