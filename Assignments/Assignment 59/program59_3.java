// 3. Write a program in Java which accepts a directory name from user and display only 
// sub-directories from that directory

import java.io.File;
import java.util.Scanner;

class program59_3
{
    public static void main(String A[])
    {
        String DirName = null;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter directory name : ");
        DirName = sobj.nextLine();

        File fobj = new File(DirName);

        if(fobj.exists() && fobj.isDirectory())
        {
            System.out.println("Directory is presnt");

            File FileList[] = fobj.listFiles();

            for(File file : FileList)
            {
                if(file.isDirectory())
                {
                    System.out.println(file);
                }
            }
        }
        else
        {
            System.out.println("Directory is not present");
        }

        sobj.close();
    }
}