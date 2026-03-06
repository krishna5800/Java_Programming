import java.time.LocalDate;
import java.util.*;

// Done
class StudyLog
{
    private LocalDate Date;
    private String Subject;
    private double Duration;
    private String Description;

    public StudyLog(LocalDate A, String B, double C, String D)
    {
        this.Date = A;
        this.Subject = B;
        this.Duration = C;
        this.Description = D;
    }

    public LocalDate getDate()
    {
        return this.Date;
    }

    public String getSubject()
    {
        return this.Subject;
    }

    public double getDuration()
    {
        return this.Duration;
    }

    public String getDescription()
    {
        return this.Description;
    }

    @Override
    public String toString()
    {
        return Date + " | " + Subject + " | " + Duration + " | " + Description;
    }
}

class StudyTracker
{
    public ArrayList <StudyLog> Database = new ArrayList <StudyLog> ();

    public void InsertLog()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("-----------------------------------------------------------------");
        System.out.println("--------------- Enter valid details of your study ---------------");
        System.out.println("-----------------------------------------------------------------");

        LocalDate Dateobj = LocalDate.now();

        System.out.println("Please enter the name of subject like C/C++/Java/Python");
        String sub = sobj.nextLine();

        System.out.println("Enter time period of your study in hour");
        double dur = sobj.nextDouble();
        sobj.nextLine();

        System.out.println("Please provide the description of your study");
        String des = sobj.nextLine();

        StudyLog studyobj = new StudyLog(Dateobj, sub, dur, des);

        Database.add(studyobj);

        System.out.println("Study Log gets stored successfully");

        System.out.println("-----------------------------------------------------------------");
    }

    public void DisplayLog()
    {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("------------- Log Report of Marvellous Study Tracker ------------");
        System.out.println("-----------------------------------------------------------------");

        for(StudyLog s : Database)
        {
            System.out.println(s);
        }

        System.out.println("-----------------------------------------------------------------");
    }
}

class program897
{
    public static void main(String A[])
    {
        StudyTracker stobj = new StudyTracker();

        stobj.InsertLog();

        stobj.DisplayLog();
    }
}