import java.util.*;

class program843
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String str = "    Hello    World    ";

        System.out.println(str);
        str =  str.trim();

        str = str.replaceAll("l", "L");

        System.out.println(str);
    }
}