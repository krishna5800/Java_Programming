// Accept N numbers from user and return fifference b/w largest and smallest number.

#include<stdio.h>
#include<stdlib.h>

int Minumum(int Arr[], int iSize)
{
    int iCnt = 0;
    int iMin = 0;
    int iMax = 0;

    for(iMin = Arr[0], iCnt = 0; iCnt < iSize; iCnt++)
    {
        if(iMin > Arr[iCnt])
        {
            iMin = Arr[iCnt];
        }
    }

    for(iMax = Arr[0], iCnt = 0; iCnt < iSize; iCnt++)
    {
        if(iMax < Arr[iCnt])
        {
            iMax = Arr[iCnt];
        }
    }

    return (iMax - iMin);
}

int main()
{
    int iLength = 0, iCnt = 0;
    int iRet = 0;
    int *iPtr = NULL;

    printf("Enter number of elements :\n");
    scanf("%d", &iLength);

    // Step 1 : Allocate memory
    
    iPtr = (int *)malloc(iLength * sizeof(int));

    if(iPtr == NULL)
    {
        printf("Unable to allocate memory\n");
        return -1;
    }

    printf("Enter %d elements : \n", iLength);

    // Step 2 : Use the allocated memory

    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        printf("Enter element %d : \n", iCnt+1);
        scanf("%d", &iPtr[iCnt]);
    }

    iRet = Minumum(iPtr, iLength);

    printf("Difference b/w largets and smallest number is : %d\n", iRet);

    // Step 3 : Free the allocated memory
    free(iPtr);

    return 0;
}