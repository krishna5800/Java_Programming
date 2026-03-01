import java.util.*;

class program851
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String str = "   india   is   my    country  ";

        System.out.println(str);
        str =  str.trim();

        str = str.replaceAll("\\s+", " ");           // Important

        String Arr[] = str.split(" ");

        System.out.println(Arr.length);

        // for (String i : Arr)
        // {
        //     System.out.println(i);
        // }

        // OR

        for(int i = 0; i < Arr.length; i++)
        {
            System.out.println(Arr[i]);
        }
    }
}