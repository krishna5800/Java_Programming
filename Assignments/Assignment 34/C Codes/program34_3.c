// Accept character from user and display its capital display all alphabtes from that to 'Z'
// if its small display all alphabets in reverse from that to 'a'
// in other cases return directly 

#include<stdio.h>

void Display(char ch)
{
    char c = '\0';

    if(ch >= 'A' && ch <= 'Z')
    {
        for(c = ch; c <= 'Z'; c++)
        {
            printf("%c\t", c);
        
        }
    }
    else if(ch >= 'a' && ch <= 'z')
    {
        for(c = ch; c <= 'z'; c++)
        {
            printf("%c\t", c);
        
        }
    }
    else
    {
        return ;
    }
}

int main()
{
    char ch = '\0';

    printf("Enter character : \n");
    scanf("%c", &ch);

    Display(ch);

    return 0;
}