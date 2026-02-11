// 4. Write java program to accept file name from user and 
// create new file of that name if it is not existing.

import java.io.*;
import java.util.*;

class program56_4
{
    public static void main(String A[]) throws Exception
    {
        String FileName = null;
        Scanner sobj = new Scanner(System.in);
        File fobj = null;

        System.out.println("Enter name of file : ");
        FileName = sobj.nextLine();

        fobj = new File(FileName);

        if(fobj.exists())
        {
            System.out.println("File exists already");
        }
        else
        {
            fobj.createNewFile();
            System.out.println("File created successfully");
        }

        sobj.close();
    }
}