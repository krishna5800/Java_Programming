import java.io.*;
import java.util.*;

class progarm565
{
    public static void main(String A[]) throws Exception
    {
        String FileName = null;
        boolean bRet = false;
        File fobj = null;
        FileReader frobj = null;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of file : ");
        FileName = sobj.nextLine();

        fobj = new File(FileName);

        if(fobj.exists())
        {
            frobj = new FileReader(FileName);

            System.out.println((char)frobj.read());
            System.out.println((char)frobj.read());
            System.out.println((char)frobj.read());
        }
        else
        {
            System.out.println("Their is no such file");
        }

        if(frobj != null)
        {
            frobj.close();
        }
        
        sobj.close();
    }
}