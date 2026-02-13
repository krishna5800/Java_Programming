// 4. Write a program in Java which accepts a directory name from user and deplay count 
// of total files and total folders

import java.io.File;
import java.util.Scanner;

class program59_4
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

            System.out.println("Total Files : " + FileList.length);
        }
        else
        {
            System.out.println("Directory is not present");
        }

        sobj.close();
    }
}