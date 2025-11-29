import java.util.*;

    // In java string don't end with '\0' so we can not use loop as c/c++
    // so we can't write code for length() methode as we written for strlen() function in c/c++
    // also their is no address in java so all is call by value in java
    // String in java is by default immutable and in c/c++ by default it is mutable

class program241
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter String : ");
        String str = sobj.nextLine();

        System.out.println("Input is : " + str);

        System.out.println("Length of string is : " + str.length()); 
    }
}   