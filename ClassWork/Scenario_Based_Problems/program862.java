import java.util.*;

class program862
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        String str = null;
        int i = 0;

        // Step 0
        System.out.println("Enter string: ");
        str = sobj.nextLine();

        // Step 1
        str = str.trim();

        // Step 2
        str = str.replaceAll("\\s+", " "); 
        
        // Step 3
        String Arr[] = str.split(" ");

        int iCount = 0;

        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i].equals("india") == true)
            {
                iCount++;
            }
        }

        System.out.println("Frequency of india word is : " + iCount);

        sobj.close();
    }
}