import java.io.*;
import java.util.*;

class progarm573
{
    public static void main(String A[]) throws Exception
    {
        int iRet = 0;

        String FileName = null;
        boolean bRet = false;
        File fobj = null;
        byte Arr[] = new byte[100];

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of file : ");
        FileName = sobj.nextLine();

        fobj = new File(FileName);

        if(fobj.exists())
        {
            FileInputStream fiobj = new FileInputStream(fobj);

            iRet = fiobj.read(Arr);

            String str = new String(Arr);

            System.out.println("iRet : " + iRet);
            System.out.println(str);
        }
        else
        {
            System.out.println("Their is no such file");
        }

        sobj.close();
    }
}