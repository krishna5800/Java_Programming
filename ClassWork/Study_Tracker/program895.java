import java.time.LocalDate;

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

class program895
{
    public static void main(String A[])
    {
        LocalDate lobj = LocalDate.now();
        
        StudyLog sobj = new StudyLog(lobj, "C-Proramming", 4.2, "Advanced pointer and array");

        System.out.println(sobj);
    }
}