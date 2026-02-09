import java.io.*;
import java.util.*;

class progarm569
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
            FileOutputStream foobj = new FileOutputStream(fobj);
            String str = "Jay Ganesh...";

            foobj.write(str);       // Error 
        }
        else
        {
            System.out.println("Their is no such file");
        }

        sobj.close();
    }
}