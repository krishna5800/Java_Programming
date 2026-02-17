// 1. Write a program in Java which accepts file name from user and display total number 
// of bytes read from that file

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

class program62_1
{
    public static void main(String A[]) throws FileNotFoundException,IOException
    {
        Scanner sobj = new Scanner(System.in);

        String FileName = null;
        int iRet = 0;
        int Total = 0;
        byte Buffer[] = new byte[1024];

        System.out.println("Enter file name : ");
        FileName = sobj.nextLine();

        File fobj = new File(FileName);

        if(fobj.exists())
        {
            FileInputStream fiobj = new FileInputStream(fobj);

            while((iRet = fiobj.read(Buffer)) != -1)
            {
                Total = Total + iRet;
            }

            System.out.println("Total bytes readed are : " + Total);

            fiobj.close();
        }
        else
        {
            System.out.println("Their is no such file");
        }

        sobj.close();
    }
}