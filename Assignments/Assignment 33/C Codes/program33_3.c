// ACCEPT CHARACTER FORM USER AND CHECK IT IS DIGIT OR NOT.

// INPUT - 7        // OUTPUT - TRUE
// INPUT - d        // OUTPUT - FALSE

#include<stdio.h>

#define TRUE 1
#define FALSE 0

typedef int BOOL; 

BOOL ChkDigit(char ch)
{
    if((ch >= 48 && ch <= 57))
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
        printf("It is a Digit\n");
    }
    else
    {
        printf("It is not a Digit\n");
    }

    return 0;
}