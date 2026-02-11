// 5. Write java program to accept directory name 
// from user and display all names of files from that directory.

import java.io.*;
import java.util.*;

class program56_5
{
    public static void main(String A[]) throws Exception
    {
        String DirectoryName = null;
        Scanner sobj = new Scanner(System.in);
        File fobj = null;

        System.out.println("Enter name of Directory : ");
        DirectoryName = sobj.nextLine();

        fobj = new File(DirectoryName);

        if(fobj.isDirectory() && fobj.exists())
        {
            System.out.println("Directory is present");

            File fArr[] = fobj.listFiles();

            System.out.println("Number of files in the folder are : " + fArr.length);

            for(int i = 0; i < fArr.length; i++)
            {
                System.out.println("File Name : " + fArr[i].getName());
            }
        }
        else
        {
            System.out.println("Their is no such directory");
        }

        sobj.close();
    }
}