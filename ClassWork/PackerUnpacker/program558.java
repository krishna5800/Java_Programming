import java.io.*;
import java.util.*;

class progarm558
{
    public static void main(String A[]) throws Exception
    {
        String FileName = null;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of file : ");

        FileName = sobj.nextLine();
     
        File fobj = new File(FileName);

        bRet = fobj.createNewFile();        // Return value is boolean

        if(bRet == true)
        {
            System.out.println("File gets created successfully");
        }
        else
        {
            System.out.println("Unable to create file");
        }

        sobj.close();
    }
}