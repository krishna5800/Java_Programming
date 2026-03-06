import java.util.*;

class program868
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        String str = null;
        int i = 0;

        System.out.println("Enter string: ");
        str = sobj.nextLine();

        str = str.trim();

        str = str.replaceAll("\\s+", " "); 
        
        String Arr[] = str.split(" ");

        StringBuffer sb = null;
        StringBuffer finalstr = new StringBuffer();

        for(i = 0; i < Arr.length; i++)
        {
            sb = new StringBuffer(Arr[i]);
            finalstr = (finalstr.append(sb.reverse())).append(" ");
        }

        System.out.println(finalstr);
        System.out.println(finalstr.length());
        System.out.println(str.length());

        sobj.close();
    }
}