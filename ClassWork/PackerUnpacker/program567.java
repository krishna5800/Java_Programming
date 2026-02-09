import java.io.*;
import java.util.*;

class progarm567
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

            char Buffer[] = new char[50];

            frobj.read(Buffer, 0, 13);

            System.out.println("Data from file : " + new String(Buffer));   // Error Resolved  
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