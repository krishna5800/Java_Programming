// Write a program which accepts a string from user and check it contains vowel or not.

#include<stdio.h>
#include<stdbool.h>

bool Difference(char str[])
{
    bool bAns = false;

    while(*str != '\0')
    {
        if(*str == 'A' ||*str == 'E' ||*str == 'I' ||*str == 'O' ||*str == 'U' ||
           *str == 'a' ||*str == 'e' ||*str == 'i' ||*str == 'o' ||*str == 'u')
        {
            bAns = true;
            break;
        }
        else
        {
            bAns = false;
        }
        str++;
    }

    return bAns;
}

int main()
{
    char Arr[50] = {'\0'};
    bool bRet = 0;

    printf("Enter String : \n");
    scanf("%[^'\n']s", Arr);

    bRet = Difference(Arr);

    if(bRet == true)
    {
        printf("It has Voewl\n");
    }
    else
    {
        printf("It has no Voewl\n");
    }

    return 0;
}