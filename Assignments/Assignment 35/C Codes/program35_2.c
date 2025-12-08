// Write a program which accepts a string from user and count number of small characters.

#include<stdio.h>

int CountSmall(char str[])
{
    int iCount = 0;

    while(*str != '\0')
    {
        if(*str >= 'a' && *str <= 'z')
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

    iRet = CountCapital(Arr);

    printf("%d\n", iRet);

    return 0;
}