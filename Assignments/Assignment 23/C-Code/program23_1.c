// Accept N mumber from user and accept one another number as NO check weather NO is 
// present or not

#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>

bool Check(int Arr[], int iLength, int iValue)
{
    int iCnt = 0;
    int iCount = 0;
    bool bAns = false;

    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        if(Arr[iCnt] == iValue)
        {
            bAns = true;
        }
    }

    return bAns;
}

int main()
{
    int iSize = 0, iCnt = 0;
    int iNo = 0;
    bool bRet = false;
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

    bRet = Check(p, iSize, iNo);

    if(bRet == true)
    {
        printf("Number is present");
    }
    else
    {
        printf("Number is not present");
    }
    
    free(p);

    return 0;
}