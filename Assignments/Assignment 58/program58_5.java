// 5. Write java program to accept directory name from user and write data of all files 
// along with its name & size of each file into one newly 
// created file named as "Marvellous.txt".

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

class program_58_5
{
    public static void main(String A[]) throws IOException, FileNotFoundException
    {
        String DirName = null;
        String Name = null;
        int iRet = 0;
        byte Buffer[] = new byte[1024];
        String OUTPUT = null;

        System.out.println("Enter Directory Name :");

        Scanner sobj = new Scanner(System.in);
        DirName = sobj.nextLine();

        File fobj = new File(DirName);

        if(fobj.exists() && fobj.isDirectory())
        {
            System.out.println("Directory is present");
            File FileList[] = fobj.listFiles();

            File created = new File("Marvellous.txt");
            created.createNewFile();

            FileOutputStream foobj = new FileOutputStream(created);

            for (File file : FileList)
            {
                FileInputStream fiobj = new FileInputStream(file);
                
                Name = "File Name : " + file.getName() + " Size : " + file.length() + "\n";

                foobj.write(Name.getBytes(), 0, Name.length());

                while((iRet = fiobj.read(Buffer)) != -1)
                {
                    OUTPUT = Buffer.toString();

                    foobj.write(Buffer, 0, iRet);
                }

                Name = "\n";

                foobj.write(Name.getBytes());
            }
        }
        else
        {
            System.out.println("Their is no such directory");
        }


        sobj.close();
    }
}