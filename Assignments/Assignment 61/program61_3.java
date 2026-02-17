// 3. Write a program in Java which accepts file name and one string from user and append that 
// string at the end of file.

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

class program61_3
{
    public static void main(String A[]) throws FileNotFoundException, IOException
    {
        String FileName = null;
        String Str = null;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter file name : ");
        FileName = sobj.nextLine();

        System.out.println("Enter String for file : ");
        Str = sobj.nextLine();

        File fobj = new File(FileName);

        if(fobj.exists() && fobj.isFile())
        {
            FileOutputStream foobj = new FileOutputStream(fobj, true);

            foobj.write(Str.getBytes());

            System.out.println("Done with string copy");
        }
        else
        {
            System.out.println("Their is no such file");
        }

    sobj.close();
    }
}