// ACCEPT CHARACTER FORM USER AND CHECK IT IS SMALL OR NOT.

// INPUT - g        // OUTPUT - TRUE
// INPUT - D        // OUTPUT - FALSE

#include<stdio.h>

#define TRUE 1
#define FALSE 0

typedef int BOOL; 

BOOL ChkDigit(char ch)
{
    if((ch >= 'a' && ch <= 'z'))
    {
        return TRUE;
    }
    else
    {
        return FALSE;
    }
}

int main()
{
    char cValue = '\0';
    BOOL bRet = FALSE;

    printf("Enter Character : \n");
    scanf("%c", &cValue);

    bRet = ChkDigit(cValue);

    if(bRet == TRUE)
    {
        printf("It is Small Character\n");
    }
    else
    {
        printf("It is not a Small Character\n");
    }

    return 0;
}