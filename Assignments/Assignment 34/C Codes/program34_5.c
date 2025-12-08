// Accept character from user and display it ASCII decimal, hexadecimal and octal
// INPUT - A
// OUTPUT - 65  0101 0X41

#include<stdio.h>

void Display(char ch)
{
    printf("%d\n", ch);
    printf("%x\n", ch);
    printf("%o\n", ch);
}

int main()
{
    char ch = '\0';

    printf("Enter character : \n");
    scanf("%c", &ch);

    Display(ch);
    
    return 0;
}