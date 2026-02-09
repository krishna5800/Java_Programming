import java.io.*;
import java.util.*;

class progarm561
{
    public static void main(String A[]) throws Exception
    {
        String FileName = null;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of file : ");
        FileName = sobj.nextLine();

        FileWriter fwobj = new FileWriter(FileName);

        sobj.close();
    }
}