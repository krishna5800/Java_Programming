// 5. Write a program in Java which acceptss file name from user and handle all possible file 
// related exceptions properly

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

class program62_5
{
    public static void main(String A[]) throws IOException
    {
        Scanner sobj = new Scanner(System.in);
        String FileName = null;
        int iRet = 0;
        byte Buffer[] = new byte[1024];
 
        System.out.println("Enter file name : ");
        FileName = sobj.nextLine();

        try
        {
            File fobj = new File(FileName);
            if(fobj.exists())
            {
                System.out.println("File already exists");
            }
            else
            {
                fobj.createNewFile();
            }
        }
        catch(FileNotFoundException fnobj)
        {
            System.out.println("FileNotFoundException");
        }
        catch(IOException iobj)
        {
            System.out.println("FileNotFoundException");
        }
    }
}