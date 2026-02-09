import java.io.*;
import java.util.*;

class progarm571
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

        if(fobj.exists())
        {
            FileInputStream fiobj = new FileInputStream(fobj);

            byte Arr[] = new byte[50];

            fiobj.read(Arr);

            System.out.println(Arr);
        }
        else
        {
            System.out.println("Their is no such file");
        }

        sobj.close();
    }
}