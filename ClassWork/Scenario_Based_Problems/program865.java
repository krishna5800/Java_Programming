import java.util.*;

class program865
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        String str = null;

        System.out.println("Enter string: ");
        str = sobj.nextLine();

        StringBuffer sb = new StringBuffer(str);

        System.out.println(sb);
        System.out.println(sb.length());

        sb.reverse();

        System.out.println(sb);

        sobj.close();
    }
}