// 1.Write a program which accept string from user and accept one character. 
// Check whether that character is present in string or not.

// Input : "Marvellous Multi OS"
//         e

// Output: true

// Input:  "Marvellous Multi OS"
//         W

// Output: false

#include<stdio.h>
#include<stdbool.h>

bool ChkChar(char *str, char ch)
{
    bool bAns = false;

    while(*str != '\0')
    {
        if(*str == ch)
        {
            return bAns = true;
            break;
        }
        
        str++;
    }

    return bAns;
}

int main()
{
    char Arr[50] = {"\0"};
    char cValue = '\0';
    bool bRet = false;

    printf("Enter String : \n");
    scanf("%[^'\n']", Arr);

    fflush(stdin);

    printf("Enter the character : \n");
    scanf("%c", &cValue);

    bRet = ChkChar(Arr, cValue);

    if(bRet == true)
    {
        printf("Character found\n");
    }
    else
    {
        printf("Character not found\n");
    }

    return 0;
}