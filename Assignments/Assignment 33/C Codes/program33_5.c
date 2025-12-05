// 5. Accept division of student from user and depends on the division display exam timing. 
// There are 4 divisions in school as A,B,C,D. Exam of division A at 7 AM, B at 8.30 AM, 
// C at 9.20 AM and D at 10.30 ΑΜ. 
// (Application should be case insensitive)

#include<stdio.h>

void DisplaySchedule(char ch)
{
    switch(ch)
    {
        case 'A':
            printf("Exam at 7 AM\n");
            break;

        case 'B':
            printf("Exam at 8:30 AM\n");
            break;

        case 'C':
            printf("Exam at 9:20 AM\n");
            break;

        case 'D':
            printf("Exam at 10:30 AM\n");
            break;

        default:
            printf("Invalid Input\n");
    }
}

int main()
{
    char cValue = '\0';

    printf("Enter your division : \n");
    scanf("%c", &cValue);

    DisplaySchedule(cValue);

    return 0;
}