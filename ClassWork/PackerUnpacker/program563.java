import java.io.*;
import java.util.*;

class progarm563
{
    public static void main(String A[]) throws Exception
    {
        String FileName = null;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of file : ");
        FileName = sobj.nextLine();

        FileReader frobj = new FileReader(FileName);

        frobj.read();

        frobj.close();
        sobj.close();
    }
}