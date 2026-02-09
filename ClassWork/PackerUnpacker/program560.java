import java.io.*;
import java.util.*;

class progarm560
{
    public static void main(String A[]) throws Exception
    {
        String FileName = null;
        boolean bRet = false;
        File fobj = null;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of file : ");
        FileName = sobj.nextLine();
     
        fobj = new File(FileName);

        bRet = fobj.exists();

        if(bRet == true)
        {
            fobj.delete();
            System.out.println("File gets deleted");
        }
        else
        {
            System.out.println("Their is no such file");
        }

        sobj.close();
    }
}