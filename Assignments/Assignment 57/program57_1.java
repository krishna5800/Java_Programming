// 1. Write java program to accept two file names from user and open first file and create 
// new file (Second name) and copy the data from first file into newly created file.

import java.io.*;
import java.util.*;

class program57_1
{
    public static void main(String A[]) throws Exception
    {
        int iRet = 0;

        Scanner sobj = null;
        sobj = new Scanner(System.in);

        byte Buffer[] = new byte[100];

        File fobjSrc = null;
        File fobjDest = null;

        FileOutputStream foobj;
        FileInputStream fiobj;

        String FileSrc = null;
        String FileDest = null;
        String Str = null;

        System.out.println("Enter Source File Name : ");
        FileSrc = sobj.nextLine();

        System.out.println("Enter Destination File Name : ");
        FileDest = sobj.nextLine();

        fobjSrc = new File(FileSrc);

        if(fobjSrc.exists())
        {
            fobjDest = new File(FileDest);

            fobjDest.createNewFile();

            fiobj = new FileInputStream(fobjSrc);

            foobj = new FileOutputStream(fobjDest);

            while((iRet = fiobj.read(Buffer, 0, 100)) != -1)
            {
                foobj.write(Buffer, 0, iRet);
            }

            fiobj.close();
            foobj.close();
        }
        else
        {
            System.out.println("Their is no such Source file present");
        }

        sobj.close();
    }
}