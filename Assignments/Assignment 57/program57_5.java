// 5. Write java program to accept directory name from user and display all names of files from 
// that directory and size of each file on screen.

import java.io.File;
import java.util.Scanner;

class program57_5
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

        if(fobj.exists() && fobj.isDirectory())
        {
            System.out.println("Directory is Present");
        }
        else
        {
            System.out.println("Directory Not Found");
            return;
        }

        File fileArray[] = fobj.listFiles();

        for (File output : fileArray)
        {
            System.out.println(output);
        }

        sobj.close();
    }
}