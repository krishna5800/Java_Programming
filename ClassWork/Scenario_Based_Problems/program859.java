import java.util.*;

class program859
{
    public static void main(String A[])
    {
        Scanner sobj = null;
        sobj=new Scanner(System.in);

        System.out.println("Enter String :");
        String str = sobj.nextLine();

        str = str.trim();

        str = str.replaceAll("\\str"," ");

        String Arr[] = str.split(" ");

        for(int i = 0;i<Arr.length;i++)
        {
            System.out.println(Arr[i] + " : "+Arr[i].length());
        }
    }
}