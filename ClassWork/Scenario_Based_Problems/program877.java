// Using Hashmap

import java.util.*;

class program877
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        String str = null;
        int i = 0;

        System.out.println("Enter string: ");
        str = sobj.nextLine();

        char Arr[] = str.toCharArray();

        HashMap <Character, Integer> hobj = new HashMap <Character, Integer> ();

        int Old = 0;

        for(char ch : Arr)
        {
            if(hobj.containsKey(ch))
            {
                Old = hobj.get(ch);
                hobj.put(ch, (Old + 1));
            }
            else
            {
                hobj.put(ch, 1);
            }
        }
        
        for(char ch : hobj.keySet())
        {
            System.out.println(ch + " : " + hobj.get(ch));
        }
        
        sobj.close();
    }
}