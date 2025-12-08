// Write a program which accepts a string from user and get difference b/w count of small and 
// count of capital letters

#include<stdio.h>

int Difference(char str[])
{
    int iCountS = 0;
    int iCountC = 0;

    while(*str != '\0')
    {
        if(*str >= 'A' && *str <= 'Z')
        {
            iCountC++;
        }
        else if(*str >= 'a' && *str <= 'z')
        {
            iCountS++;
        }
        str++;
    }

    return (iCountS-iCountC);
}

int main()
{
    char Arr[50] = {'\0'};
    int iRet = 0;

    printf("Enter String : \n");
    scanf("%[^'\n']s", Arr);

    iRet = Difference(Arr);

    printf("%d\n", iRet);

    return 0;
}