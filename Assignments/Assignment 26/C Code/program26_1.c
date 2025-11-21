// Input : 5 
// Output : A   B   C   D   E

#include<stdio.h>

void Pattern(int iNo)
{
    int iCnt = 0;
    int iAlphabet = 65;     // ASCII OF 'A' IS 65
    
    for(iCnt = 1; iCnt <= iNo; iCnt++)
    {
        printf("%c\t", iAlphabet);
        iAlphabet++;
    }
}

int main()
{
    int iValue = 0;

    printf("Enter number of elements : \n");
    scanf("%d", &iValue);

    Pattern(iValue);

    return 0;
}