// Accept N numbers from user and return smallest number.

#include<stdio.h>
#include<stdlib.h>

int Minumum(int Arr[], int iSize)
{
    int iCnt = 0;
    int iMin = 0;

    for(iMin = Arr[0], iCnt = 0; iCnt < iSize; iCnt++)
    {
        if(iMin > Arr[iCnt])
        {
            iMin = Arr[iCnt];
        }
    }

    return iMin;
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

    printf("Minimum is : %d\n", iRet);

    // Step 3 : Free the allocated memory
    free(iPtr);

    return 0;
}