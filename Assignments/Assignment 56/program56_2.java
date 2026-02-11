// 2. Write java program to accept file name from user and open that file and display the contents on screen.

import java.io.*;
import java.util.*;

class program56_2
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
            FileInputStream fiobj = new FileInputStream(fobj);
            System.out.println("File Opened Successfully");

            fiobj.read(Buffer, 0, 13);

            System.out.println("Data from opened file : " + new String(Buffer));

            fiobj.close();
        }
        else
        {
            System.out.println("Their is no such file");
        }

        sobj.close();
    }
}