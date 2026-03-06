import java.util.*;

class program864
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        String str = null;
        int i = 0;

        System.out.println("Enter string: ");
        str = sobj.nextLine();

        StringBuffer sb = new StringBuffer(str);

        System.out.println(sb);
        System.out.println(sb.length());

        sobj.close();
    }
}