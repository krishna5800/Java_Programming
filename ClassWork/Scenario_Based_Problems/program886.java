import java.util.*;

class Student
{
    public String name;
    public int marks;

    public Student(String A, int B) 
    {
        this.name = A;
        this.marks = B;
    }

    public void Display()
    {
        System.out.println(name + " : " + marks);
    }

    @Override
    public String toString()
    {
        return "inside toString";
    }
}

class program886
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        ArrayList <Integer> aobj = new ArrayList <Integer>();

        Student s1 = new Student("Sagar", 90);
        Student s2 = new Student("Rahul", 80);
        Student s3 = new Student("Pooja", 92);
        Student s4 = new Student("Amit", 72);

        System.out.println(s1); // s1.toString()  ha call automatically jato
        System.out.println(s2); // s2.toString()  ha call automatically jato

        s1.Display();
        s2.Display();
    }
}