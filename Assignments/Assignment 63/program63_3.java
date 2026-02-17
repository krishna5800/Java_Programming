// 3. Write a program in Java which accepts source directory and destination directory and 
// copy all files from source directory into destination directory.

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

class program63_3
{
    public static void main(String A[]) throws FileNotFoundException, IOException
    {
        String Dirname1 = null;
        String Dirname2 = null;
        boolean bRet = false;
        int iRet = 0;
        byte Buffer[] = new byte[1024];
        String filename = null;

        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter Source Directory Name : ");
        Dirname1 = sobj.nextLine();

        System.out.println("Enter Destination Directory Name : ");
        Dirname2 = sobj.nextLine();

        File fobj1 = new File(Dirname1);

        if(fobj1.exists() && fobj1.isDirectory())
        {
            File fobj2 = new File(Dirname2);

            bRet = fobj2.mkdir();

            if(bRet)
            {
                System.out.println("Directory created successfully");
            }
            else
            {
                System.out.println("Unable to create directory");
            }

            File FileList[] = fobj1.listFiles();

            for(File file : FileList)
            {
                if(file.isFile())
                {
                    filename = file.getName();

                    File fobj3 = new File(fobj2, filename);

                    fobj3.createNewFile();

                    FileInputStream fiobj = new FileInputStream(file);
                    FileOutputStream foobj = new FileOutputStream(fobj3);

                    while((iRet = fiobj.read(Buffer)) != -1)
                    {
                        foobj.write(Buffer, 0, iRet);
                    }

                    fiobj.close();
                    foobj.close();
                }
            }
        }
        else
        {
            System.out.println("Their is no such directory");
        }

    sobj.close();
    }
}