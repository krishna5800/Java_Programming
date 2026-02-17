// 1. Write a program in Java which accepts source and destination file names and copy file 
// using BufferedInputStream and BufferedOutputStream.

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

class program63_1
{
    public static void main(String A[]) throws IOException
    {
        String SrcName = null;
        String DestName = null;
        int iRet = 0;
        byte Buffer[] = new byte[1024];

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Source File :");
        SrcName = sobj.nextLine();

        System.out.println("Enter Destination File :");
        DestName = sobj.nextLine();

        File fobj = new File(SrcName);

        if(fobj.exists())
        {
            File fdest = new File(DestName);

            fdest.createNewFile();

            FileInputStream fiobj = new FileInputStream(fobj);
            BufferedInputStream biobj = new BufferedInputStream(fiobj);

            FileOutputStream foobj = new FileOutputStream(fdest);
            BufferedOutputStream boobj = new BufferedOutputStream(foobj);

            while((iRet = biobj.read(Buffer)) != -1)
            {
                boobj.write(Buffer,0,iRet);
            }

            System.out.println("Data copied successfully");

            biobj.close();
            fiobj.close();
            
            boobj.close();
            foobj.close();
        }
        else
        {
            System.out.println("Their is no such file");
        }


    }
}