// 2. Write java program to accept directory name from user and write names of all files 
// from that directory into one newly created file named as "Marvellous.txt".

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

class program_58_2
{
    public static void main(String A[]) throws IOException
    {
        String DirName = null;
        byte Buffer[] = new byte[1024];

        System.out.println("Enter Directory Name :");

        Scanner sobj = new Scanner(System.in);
        DirName = sobj.nextLine();

        File fobj = new File(DirName);

        if(fobj.exists() && fobj.isDirectory())
        {
            File FileList[] = fobj.listFiles();

            File created = new File("Marvellous.txt");

            try
            {
                created.createNewFile();
            }
            catch(Exception eobj)
            {
                System.out.println(eobj);
            }

            FileOutputStream foobj = new FileOutputStream(created);

            for (File output : FileList)
            {
                String Name = output.getName() + "\n";
                Buffer = Name.getBytes();

                if(output.isFile())
                {
                    foobj.write(Buffer);   
                }
            }
        }

        System.out.println("Files Copied Suffessfully");

        sobj.close();
    }
}