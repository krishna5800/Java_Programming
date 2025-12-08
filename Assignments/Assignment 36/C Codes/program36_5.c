// 5. Write a program which accept string from user and print count of whitespaces in it.

// Input:  "Marvellous"     "Marvellous Infosystems"

// Output:  0               1

#include<stdio.h>

int CountWhite(char *str)
{
    int iCount = 0;

    while(*str != '\0')
    {
        if(*str == ' ')
        {
            iCount++;
        }

        str++;
    }

    return iCount;
}

int main()
{
    char Arr[50] = {'\0'};
    int iRet = 0;

    printf("Enter String : \n");
    scanf("%[^'\n']s", Arr);

    iRet = CountWhite(Arr);

    printf("%d\n", iRet);

    return 0;
}