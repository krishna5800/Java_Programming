// Find the maximum word from the string

import java.util.*;

class program860
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        String str = null;

        System.out.println("Enter string: ");
        str = sobj.nextLine();

        str = str.trim();

        str = str.replaceAll("\\s+", " "); 
        
        String Arr[] = str.split(" ");

        int iMax = 0;
        String MaxWord = null;

        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i].length() > iMax)
            {
                iMax = Arr[i].length();
                MaxWord = Arr[i];
            }
        }

        System.out.println("Longest word length is: " + iMax);
        System.out.println("Longest word is: " + MaxWord);

        sobj.close();
    }
}