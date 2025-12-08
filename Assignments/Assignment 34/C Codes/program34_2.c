// Accept character from user and display its capital if its small , 
// small if it is capital and as it is if its not alphabet 

// INPUT -  G       OUTPUT - g

// INPUT -  g       OUTPUT - G

// INPUT -  4       OUTPUT - 4

// INPUT -  %       OUTPUT - %

#include<stdio.h>

void Display(char ch)
{
    if(ch > 'A' && ch < 'Z')
    {
        printf("Small is : %c\n", (ch+32));
    }
    else if(ch > 'a' && ch < 'z')
    {
        printf("Capital is : %c\n", (ch-32));
    }
    else
    {
        printf("Character is : %c\n", ch);
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