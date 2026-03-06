
// India is my country i live in INDIA

// Bharat is my country i live in BHARAT

import java.util.*;

class program870
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

        StringBuffer finalstr = new StringBuffer();

        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i].equalsIgnoreCase("india") == true)
            {
                 finalstr.append("bharat" + " ");
            }
            else
            {
                finalstr.append(Arr[i] + " ");
            }
        }

        System.out.println(finalstr);

        sobj.close();
    }
}