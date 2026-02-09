// Unpacking Code

import java.io.File;
import java.io.FileInputStream;
import java.util.*;

class progarm607
{
    public static void main(String A[]) throws Exception
    {
        // Variable Creation
        Scanner sobj = null;
        String FileName = null;
        File fpackobj = null;
        
        sobj = new Scanner(System.in);

        System.out.println("Enter the name of packed file : ");
        FileName = sobj.nextLine();

        fpackobj = new File(FileName);

        if((fpackobj.exists()) == false)
        {
            System.out.println("Error : Their is no such packed file");
            return;
        }
    }
}