// 5. Write a program in Java which accepts file name from user and it split that. 
// File into two separate files (first half and second half)

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

class program61_5
{
    public static void main(String A[]) throws FileNotFoundException, IOException
    {
        Scanner sobj = new Scanner(System.in);
        String FileName = null;
        int Half = 0;
        int iRet = 0;
        int Written = 0;
        byte Buffer[] = new byte[1024];

        System.out.println("Enter file name : ");
        FileName = sobj.nextLine();

        File fobj = new File(FileName);

        if(fobj.exists() && fobj.isFile())
        {
            String File1 = "First.txt";
            String File2 = "Second.txt";

            File first = new File(File1);
            first.createNewFile();

            File Second = new File(File2);
            Second.createNewFile();

            Half = (int)fobj.length() / 2;

            FileInputStream fiobj = new FileInputStream(fobj);

            FileOutputStream foobj1 = new FileOutputStream(first);
            FileOutputStream foobj2 = new FileOutputStream(Second);

            while((iRet = fiobj.read(Buffer)) != -1)
            {
                if(Written + iRet <= Half)
                {
                    foobj1.write(Buffer, 0 , iRet);

                    Written = iRet + Written;
                }
                else
                {
                    int remain = (int)(Half-Written);

                    if(remain > 0)
                    {
                        foobj1.write(Buffer, 0, remain);
                    }

                    foobj2.write(Buffer, remain, iRet - remain);
                    Written = Half;
                }
                
            }

            System.out.println("Done with splitting");

            fiobj.close();
            foobj1.close();
            foobj2.close();
        }
        else
        {
            System.out.println("Their is no such file");
        }

    sobj.close();
    }
}