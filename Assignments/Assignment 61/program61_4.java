// 4. Write a program in Java which accepts two input file names and one output file 
// name and merge both files into the output file.

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

class program61_4
{
    public static void main(String A[]) throws FileNotFoundException, IOException
    {
        Scanner sobj = new Scanner(System.in);
        String FirstFile = null;
        String SecondFile = null;
        byte Buffer[] = new byte[1024];
        int iRet = 0;

        System.out.println("Enter 1st file : ");
        FirstFile = sobj.nextLine();

        System.out.println("Enter 2nd file : ");
        SecondFile = sobj.nextLine();

        File fobj1 = new File(FirstFile);
        File fobj2 = new File(SecondFile);

        if(fobj1.exists() && fobj2.exists())
        {
            String OutputFile = null;

            System.out.println("Enter Output File Name :");
            OutputFile = sobj.nextLine();

            File fout = new File(OutputFile);

            fout.createNewFile();

            FileInputStream fiobj1 = new FileInputStream(FirstFile);
            FileInputStream fiobj2 = new FileInputStream(SecondFile);

            FileOutputStream foobj = new FileOutputStream(fout);

            while((iRet = fiobj1.read(Buffer)) != -1)
            {
                foobj.write(Buffer, 0, iRet);
            }

            while((iRet = fiobj2.read(Buffer)) != -1)
            {
                foobj.write(Buffer, 0, iRet);
            }

            fiobj1.close();
            fiobj2.close();

            foobj.close();
        }

    sobj.close();
    }
}