// 5. Accept division of student from user and depends on the division display exam timing. 
// There are 4 divisions in school as A,B,C,D. Exam of division A at 7 AM, B at 8.30 AM, 
// C at 9.20 AM and D at 10.30 ΑΜ. 
// (Application should be case insensitive)


import java.util.*;

class CheckX
{
    void DisplaySchedule(char ch)
    {
        switch(ch)
        {
            case 'A':
                System.out.println("Exam at 7 AM\n");
                break;

            case 'B':
                System.out.println("Exam at 8:30 AM\n");
                break;

            case 'C':
                System.out.println("Exam at 9:20 AM\n");
                break;

            case 'D':
                System.out.println("Exam at 10:30 AM\n");
                break;

            default:
                System.out.println("Invalid Input\n");
        }
    }
}

class program33_5
{
    public static void main(String A[]) 
    {
        char cValue = '\0';

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your division : ");

        cValue = sobj.nextLine().charAt(0);       // Important

        CheckX cobj = new CheckX();

        cobj.DisplaySchedule(cValue);
    }
}