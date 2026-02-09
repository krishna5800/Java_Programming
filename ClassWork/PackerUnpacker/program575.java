import java.io.*;
import java.util.*;

class progarm575
{
    public static void main(String A[]) throws Exception
    {
        int iRet = 0;

        String FileName = null;
        boolean bRet = false;
        File fobj = null;
        byte Buffer[] = new byte[100];

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of file : ");
        FileName = sobj.nextLine();

        fobj = new File(FileName);

        if(fobj.exists())
        {
            String str = null;
            FileInputStream fiobj = new FileInputStream(fobj);

            while((iRet = fiobj.read(Buffer)) != -1)
            {
                str = new String(Buffer);
                System.out.print(str);
                str = null;
            }

            System.out.println();
        }
        else
        {
            System.out.println("Their is no such file");
        }

        sobj.close();
    }
}