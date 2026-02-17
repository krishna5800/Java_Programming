// 4. Write a program in Java which accepts file name from user and create a backup copy 
// of it with name original_backup.txt

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

class program62_4
{
    public static void main(String A[]) throws IOException
    {
        Scanner sobj = new Scanner(System.in);
        String FileName = null;
        int iRet = 0;
        byte Buffer[] = new byte[1024];
 
        System.out.println("Enter file name : ");
        FileName = sobj.nextLine();

        File fobj = new File(FileName);

        if(fobj.exists())
        {
            String str[] = FileName.split("\\.");
            String BackupName = str[0] + "_backup.txt";

            File backup = new File(BackupName);
            backup.createNewFile();

            FileOutputStream foobj = new FileOutputStream(backup);
            FileInputStream fiobj = new FileInputStream(fobj);

            while((iRet = fiobj.read(Buffer)) != -1)
            {
                foobj.write(Buffer, 0, iRet);
            }

            System.out.println("Backup Created");

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