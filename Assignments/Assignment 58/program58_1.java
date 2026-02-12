// 1. Write java program to accept directory name from user and display all names of 
// files from that directory which are regular file.

import java.io.File;
import java.util.Scanner;

class program_58_1
{
    public static void main(String A[])
    {
        String DirName = null;

        System.out.println("Enter Directory Name :");

        Scanner sobj = new Scanner(System.in);
        DirName = sobj.nextLine();

        File fobj = new File(DirName);

        if(fobj.exists() && fobj.isDirectory())
        {
            File FileList[] = fobj.listFiles();

            System.out.println("Regular Files from Directory Are : ");

            for (File output : FileList)
            {
                if(output.isFile())
                {
                    System.err.println(output);
                }
            }
        }

        sobj.close();
    }
}