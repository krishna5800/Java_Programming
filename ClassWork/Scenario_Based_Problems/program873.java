// Using Hashmap

import java.util.*;

class program873
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

        hobj.put('h', 1);
        hobj.put('e', 1);
        hobj.put('l', 2);
        hobj.put('o', 1);

        System.out.println(hobj);
        
        sobj.close();
    }
}