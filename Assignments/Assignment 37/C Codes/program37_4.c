// 4.Write a program which accept string from user and accept one character. 
// and return index of last occurance of that character.

// Input : "Marvellous Multi OS"
//         M

// Output: 11

// Input:  "Marvellous Multi OS"
//         W

// Output: -1

#include<stdio.h>

int LastChar(char *str, char ch)
{
    int iCount = 0;

    while(*str != '\0')
    {
        if(*str == ch)
        {
            iCount++;
        }

        str++;
    }

    if(*str == '\0' && iCount == 0)
    {
        return -1;
    }
    else
    {
        return iCount;
    }
}

int main()
{
    char Arr[50] = {"\0"};
    char cValue = '\0';
    int iRet = 0;

    printf("Enter String : \n");
    scanf("%[^'\n']", Arr);

    fflush(stdin);

    printf("Enter the character : \n");
    scanf("%c", &cValue);

    iRet = LastChar(Arr, cValue);

    printf("%d\n", iRet);

    return 0;
}