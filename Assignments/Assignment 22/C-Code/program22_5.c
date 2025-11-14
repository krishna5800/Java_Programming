// Accept N numbers from user and return frequancy of user defined in it.

#include<stdio.h>
#include<stdlib.h>

int CheckFrequancy(int Arr[], int iLength, int iValue)
{
    int iCnt = 0;
    int iCount = 0;

    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        if(Arr[iCnt] == iValue)
        {
            iCount++;
        }
    }

    return iCount;
}

int main()
{
    int iSize = 0, iCnt = 0;
    int iNo = 0;
    int iRet = 0;
    int *p= NULL;

    printf("Enter number of elements : \n");
    scanf("%d", &iSize);

    printf("Enter the element whose frequancy you want : \n");
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

    iRet = CheckFrequancy(p, iSize, iNo);

    printf("Frequency of %d is : %d", iNo, iRet);
    
    free(p);

    return 0;
}