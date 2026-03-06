// Find the maximum word from the string

import java.util.*;

class program861
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        String str = null;
        String MaxWord = null;

        // Step 1
        System.out.println("Enter string: ");
        str = sobj.nextLine();

        // Step2
        str = str.trim();
        str = str.replaceAll("\\s+", " "); 
        
        // Step 3
        String Arr[] = str.split(" ");

        int iMax = 0;
        int MaxIndex = 0;

        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i].length() > iMax)
            {
                iMax = Arr[i].length();
                MaxIndex = i;
            }
        }

        System.out.println("Longest word length is: " + iMax);
        System.out.println("Longest word is: " + Arr[MaxIndex]);

        sobj.close();
    }
}