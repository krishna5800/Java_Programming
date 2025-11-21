/*
Input : iRow = 4        iCol = 4

Output : 
        A   B   C   D
        a   b   c   d
        A   B   C   D
        a   b   c   d
*/

#include<stdio.h>

void Pattern(int iRow, int iCol)
{
    int i = 0;
    int j = 0;
    int iCapital = 0;
    int iSmall = 0;

    for(i = 1; i <= iRow; i++)
    {
        iCapital = 65;
        iSmall = 97;

        for(j = 1; j <= iCol; j++)
        {
            if(i%2 != 0)
            {
                printf("%c\t", iCapital);
                iCapital++;
            }
            else
            {
                printf("%c\t", iSmall);
                iSmall++;
            }
        }
        printf("\n");
    }

}

int main()
{
    int iValue1 = 0;
    int iValue2 = 0;

    printf("Enter number of rows :\n");
    scanf("%d", &iValue1);

    printf("Enter number of columns :\n");
    scanf("%d", &iValue2);

    Pattern(iValue1, iValue2);

    return 0;
}