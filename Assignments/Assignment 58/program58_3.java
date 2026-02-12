// 3. Write java program to accept directory name from user and write data of all files into 
// one newly created file named as "Marvellous.txt".

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

class program_58_3
{
    public static void main(String A[]) throws FileNotFoundException, IOException
    {
        String DirName = null;
        byte Buffer[] = new byte[1024];
        int iRet = 0;
        String OUTPUT = null;

        System.out.println("Enter Directory Name :");

        Scanner sobj = new Scanner(System.in);
        DirName = sobj.nextLine();

        File fobj = new File(DirName);

        if(fobj.exists() && fobj.isDirectory())
        {
            System.out.println("Directory is present");

            File filelist[] = fobj.listFiles();

            File create = new File("Marvellous.txt");   
            create.createNewFile();

            FileOutputStream foobj = new FileOutputStream(create);

            for (File file : filelist)
            {

                FileInputStream fiobj = new FileInputStream(file);  

                while((iRet = fiobj.read(Buffer)) != -1)
                {
                    OUTPUT = Buffer.toString();

                    foobj.write(Buffer, 0, iRet);
                }

                fiobj.close();
            }
        }
        else 
        {
            System.out.println("Directory is not present");
        }

        sobj.close();
    }
}