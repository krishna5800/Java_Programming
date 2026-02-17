// 3. Write a program in Java which accepte file name and integer N from user and copy 
// last N bytes into a new file

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

class program62_3
{
    public static void main(String A[]) throws FileNotFoundException,IOException
    {
        Scanner sobj = new Scanner(System.in);

        String FileName = null;
        int iRet = 0;
        int N = 0;
        int Total = 0;
        byte Buffer[] = new byte[1024];

        System.out.println("Enter file name : ");
        FileName = sobj.nextLine();

        System.out.println("Enter number of bytes you want to read :");
        N = sobj.nextInt();


        File fobj = new File(FileName);

        if(fobj.exists())
        {
            String Copy = "Copy.txt";
            long FileSize = 0;

            FileSize = fobj.length();

            long skip = 0;

            skip = FileSize-N;

            File fobj1 = new File(Copy);
            fobj1.createNewFile();

            FileInputStream fiobj = new FileInputStream(fobj);

            FileOutputStream foobj = new FileOutputStream(fobj1);

            if(skip > 0)
            {
                fiobj.skip(skip);
            }

            while((iRet = fiobj.read(Buffer)) != -1)
            {
                foobj.write(Buffer, 0, iRet);
            }

            System.out.println("File copied successfully");

            fiobj.close();
        }
        else
        {
            System.out.println("Their is no such file");
        }

        sobj.close();
    }
}