// 3. Write java program to accept file name from user 
// and open that file in write mode and write some data at the end of file.

import java.io.*;
import java.util.*;

class program56_3
{
    public static void main(String A[]) throws Exception
    {
        String FileName = null;
        Scanner sobj = new Scanner(System.in);
        File fobj = null;
        byte Buffer[] = new byte[100];
        int iRet = 0;
        String str = null;

        System.out.println("Enter name of file : ");
        FileName = sobj.nextLine();

        fobj = new File(FileName);

        if(fobj.exists())
        {
            FileOutputStream foobj = new FileOutputStream(fobj);
            System.out.println("File opened successfully");

            str = "Jay Ganesh...";

            Buffer = str.getBytes();

            foobj.write(Buffer, 0, 13);

            foobj.close();
        }
        else
        {
            System.out.println("Their is no such file");
        }

        sobj.close();
    }
}