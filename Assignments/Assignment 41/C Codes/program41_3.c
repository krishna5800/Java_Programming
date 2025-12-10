// 3. Write a recursive program which display below pattern.
// count of string (string length)
// Input :  Hello
// Output : 5

#include<stdio.h>

int Display(char *str)
{
    static int iCount = 0;

    if(*str != '\0')
    {
        iCount++;
        str++;
        Display(str);               // recursive call  // confusion here 
    }

    return iCount;
}

int main()
{
    char cValue[] = {"\0"};
    int iRet = 0;

    printf("Enter String : \n");
    scanf("%[^'\n']s", &cValue);

    iRet = Display(cValue);

    printf("%d\n", iRet);
    
    return 0;
}