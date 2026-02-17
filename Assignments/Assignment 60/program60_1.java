// 1. Write a program in Java which accepts a directory name from user and calculate 
// total size of all files from that directory

import java.io.File;
import java.util.Scanner;

class program60_1
{
    public static void main(String A[])
    {
        String DirName = null;
        Scanner sobj = new Scanner(System.in);
        long Ret = 0;

        System.out.println("Enter directory name : ");
        DirName = sobj.nextLine();

        File fobj = new File(DirName);

        if(fobj.exists() && fobj.isDirectory())
        {
            System.out.println("Directory is presnt");

            File FileList[] = fobj.listFiles();

            for(File file : FileList)
            {
                Ret = Ret + file.length();
            }
        }
        else
        {
            System.out.println("Directory is not present");
        }

        System.out.println("Size of all files from directory : " + Ret);

        sobj.close();
    }
}