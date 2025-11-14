// Accept N mumber from user and accept one another number as NO 
// return index of last occurance of number.

#include<stdio.h>
#include<stdlib.h>

int LastOcc(int Arr[], int iLength, int iValue)
{
    int iCnt = 0;
    int iOccurance = -1;

    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        if(Arr[iCnt] == iValue)
        {
            iOccurance = iCnt;
        }
    }

    return iOccurance;
}

int main()
{
    int iSize = 0, iCnt = 0;
    int iNo = 0;
    int iRet = 0;
    int *p= NULL;

    printf("Enter number of elements : \n");
    scanf("%d", &iSize);

    printf("Enter the element whose no. you want : \n");
    scanf("%d", &iNo);

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

    iRet = LastOcc(p, iSize, iNo);

    if(iRet == -1)
    {
        printf("There is no such number");
    }
    else
    {
        printf("First occurence of number is %d", iRet);
    }

    free(p);

    return 0;
}