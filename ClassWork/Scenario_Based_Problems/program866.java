import java.util.*;

class program866
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

        for(i = 0; i < Arr.length; i++)
        {
            sb = new StringBuffer(Arr[i]);
            sb.reverse();

            System.out.print(sb + " ");
        }

        System.out.println();

        sobj.close();
    }
}