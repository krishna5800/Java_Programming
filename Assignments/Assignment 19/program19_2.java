// Write a program to display the grade of student based on marks.

class Logic
{
    void dislpayGrade(int iMarks)
    {
        if(iMarks < 35 && iMarks > 0) 
        {
            System.out.println("Failed !!");
        }
        else if(iMarks < 50 && iMarks > 35) 
        {
            System.out.println("Passed with minimum marks");
        }
        else if(iMarks < 75 && iMarks > 50) 
        {
            System.out.println("Passed with first class marks");
        }
        else if(iMarks < 100 && iMarks > 75) 
        {
            System.out.println("Passed with distinction marks");
        }
        else
        {
            System.out.println("Invalid Input");
        }
    }
}

class program19_2
{
    public static void main(String A[])
    {
       Logic lobj = new Logic();
       lobj.dislpayGrade(82);
    }
}