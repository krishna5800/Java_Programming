// 1. Write a program in Java which accepts sovorce file name and destination 
// file name from user and copy data from source to destination (byte by byte).

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

class program61_1
{
    public static void main(String A[]) throws FileNotFoundException, IOException
    {
        String SrcFile = null;
        String DestFile = null;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Source file : ");
        SrcFile = sobj.nextLine();

        System.out.println("Enter Destination file : ");
        DestFile = sobj.nextLine();

        File fobjsrc = new File(SrcFile);

        if(fobjsrc.exists() && fobjsrc.isFile())
        {
            File fobjdest = new File(DestFile);

            fobjdest.createNewFile();

            FileInputStream fiobj = new FileInputStream(fobjsrc);

            FileOutputStream foobj = new FileOutputStream(fobjdest);

            while((iRet = fiobj.read()) != -1)
            {
                foobj.write(iRet);
            }
            
            System.out.println("Data copied successfully");

            fiobj.close();
            foobj.close();
        }
        else
        {
            System.out.println("Their is no such file");
        }

    sobj.close();
    }
}