  // Anagram start
    // 0    1   2   3   4   5   6   7   8   9   ...
    // a    b   c   d   e   f   g   h   i   j   ...
    // 97   98  99  100 101 102 103 104 105 106 ...

import java.util.*;

class program871
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        String str = null;
        int i = 0;

        System.out.println("Enter string: ");
        str = sobj.nextLine();

        char Arr[] = str.toCharArray();

        int Count[] = new int[26];

        for(i = 0; i < Arr.length; i++)
        {
            System.out.println((int)Arr[i]);
        }

        sobj.close();
    }
}