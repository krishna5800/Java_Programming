// 3. Write java program to accept directory name from user and create that directory.

import java.io.File;
import java.util.Scanner;

class program57_3
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);
        File fobj = null;

        String FileName = null;

        System.out.println("Enter File Name : ");
        FileName = sobj.nextLine();

        fobj = new File(FileName);

        if(fobj.exists() && fobj.isDirectory())
        {
            System.out.println("Is Directory Present");
        }
        else
        {
            fobj.mkdir();

            System.out.println("Directory Sucssfully Created");
        }

        sobj.close();
    }
}