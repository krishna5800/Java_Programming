// Accept N mumber from user and accept one range
// display all elements in range 

#include<stdio.h>
#include<stdlib.h>

void Range(int Arr[], int iLength, int iValue1, int iValue2)
{
    int iCnt = 0;

    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        if(Arr[iCnt] > iValue1 && Arr[iCnt] < iValue2)
        {
            printf("%d  ", Arr[iCnt]);
        }
    }
}

int main()
{
    int iSize = 0, iCnt = 0;
    int iNo1 = 0, iNo2 = 0;
    int *p= NULL;

    printf("Enter number of elements : \n");
    scanf("%d", &iSize);

    printf("Enter the 1st number you want : \n");
    scanf("%d", &iNo1);

    printf("Enter the last number you want : \n");
    scanf("%d", &iNo2);

    p = (int *)malloc(iSize*sizeof(int));

    if(p == NULL)
    {
        printf("Unable to allocate memory");
        return -1;
    }

    printf("Enter %d elements :\n", iSize);

    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        printf("Enter element no %d : \n", iCnt+1);
        scanf("%d", &p[iCnt]);
    }

    Range(p, iSize, iNo1, iNo2);

    free(p);

    return 0;
}