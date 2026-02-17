// 4. Write a program in Java which accepts directory name and create a file Combined. bin that stores data of all 
// files sequentially.

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

class program63_4
{
    public static void main(String A[]) throws IOException
    {
        Scanner sobj = new Scanner(System.in);

        String DirName = null;
        String name = null;
        int iRet = 0;
        int Total =0;
        byte Buffer[] = new byte[1024];

        System.out.println("Enter directory name :");
        DirName = sobj.nextLine();

        File fobj1 = new File(DirName);

        if(fobj1.exists() && fobj1.isDirectory())
        {
            File fobj2 = new File("Combined.bin");

            fobj2.createNewFile();

            File FileList[] = fobj1.listFiles();

            FileOutputStream foobj = new FileOutputStream(fobj2);

            for(File file : FileList)
            {
                FileInputStream fiobj = new FileInputStream(file);
                

                while((iRet = fiobj.read(Buffer)) != -1)
                {
                    foobj.write(Buffer, 0, iRet);
                    Total = Total+iRet;
                }

                fiobj.close();
            }

            foobj.close();
        }
        else
        {
            System.out.println("Their is no such directory");
        }
    }
}