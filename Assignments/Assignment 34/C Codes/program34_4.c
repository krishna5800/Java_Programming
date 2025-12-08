// Accept character from user and check weather it is special character or not
// !    @   #   $   %   ^   &   *

// INPUT - D      OUTPUT - FALSE
// INPUT - %      OUTPUT - TRUE

#include<stdio.h>
#include<stdbool.h>

bool ChkSpecial(char ch)
{
    if(ch == '!' || ch == '@'  || ch == '#'  || ch == '$' || ch == '%' ||  ch == '^' ||ch == '&' || ch == '*')
    {
        return true;
    }
    else
    {
        return false;
    }
}

int main()
{
    char ch = '\0';
    bool bRet = false;

    printf("Enter character : \n");
    scanf("%c", &ch);

    bRet = ChkSpecial(ch);

    if(bRet == true)
    {
        printf("TRUE\n");
    }
    else
    {
        printf("FALSE\n");
    }
    
    return 0;
}