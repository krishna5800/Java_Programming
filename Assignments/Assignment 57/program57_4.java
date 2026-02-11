// 4. Write java program to accept file name from user calculate
// checksum of that file and display on screen.

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

class Checksum
{
    String CalculateChecksum(File fobj) throws NoSuchAlgorithmException, IOException
    {
        MessageDigest mobj = MessageDigest.getInstance("MD5");

        try
        {
            FileInputStream fiobj = new FileInputStream(fobj);
            byte Input[] = new byte[1024];
            int Read = 0;

            while((Read = fiobj.read(Input)) != -1)
            {
                mobj.update(Input, 0, Read);
            }

            byte Output[] = mobj.digest();

            StringBuilder sbobj = new StringBuilder();

            for (byte b : Output)
            {
                sbobj.append(String.format("%02x", b));
            }

            return sbobj.toString();
        }
        catch(FileNotFoundException fnobj)
        {
            throw new RuntimeException(fnobj);
        }
    }
}

class program57_4
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);
        File fobj = null;
        String FileName = null;
        String Ret = null;

        System.out.println("Enter File Name : ");
        FileName = sobj.nextLine();

        fobj = new File(FileName);

        if(fobj.exists() && fobj.isFile())
        {
            System.out.println("File is Regular File");
        }
        else
        {
            System.out.println("File Not Found");
            return;
        }

        Checksum cobj = new Checksum();

        Ret = cobj.CalculateChecksum(fobj);

        System.out.println("Checksum for " + FileName + " is : " + Ret);

        sobj.close();
    }
}