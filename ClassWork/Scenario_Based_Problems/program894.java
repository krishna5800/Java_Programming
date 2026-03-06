import java.io.*;
import java.util.*;

class Student
{
    private String name;
    private int marks;

    public Student(String A, int B) 
    {
        this.name = A;
        this.marks = B;
    }

    public String getName()
    {
        return this.name;
    }

    public int getMarks()
    {
        return this.marks;
    }

    public void Display()
    {
        System.out.println(name + " : " + marks);
    }

    @Override
    public String toString()
    {
        return this.name + " : " + this.marks;
    }
}

class program894
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        ArrayList <Student> database = new ArrayList <Student>();

        Student s1 = new Student("Sagar", 90);
        Student s2 = new Student("Rahul", 80);
        Student s3 = new Student("Pooja", 92);
        Student s4 = new Student("Amit", 72);

        database.add(s1);
        database.add(s2);
        database.add(s3);
        database.add(s4);

        String FileName = "Marvellous.csv";

        try(FileWriter fwobj = new FileWriter(FileName))
        { 
            fwobj.write("name, marks\n");

            for(Student s : database)
            {
                fwobj.write(s.getName() + "," + s.getMarks() + "\n");
            }
        }
        catch(Exception eobj)
        {
            System.out.println("Exception occured");
        }
        finally
        {
            System.out.println("Data gets stored successfully");

            database.clear();
        }
    }
}