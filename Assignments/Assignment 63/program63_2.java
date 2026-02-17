// 2. Write a program in Java which copies a file using normal streams and buffered streams and 
// displays the time required for both.

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

class program63_2
{
    public static void main(String A[]) throws IOException
    {
        String SrcName = null;
        String DestNameNormal = null;
        String DestNameBuffered = null;
        int iRet = 0;
        byte Buffer[] = new byte[1024];

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Source File :");
        SrcName = sobj.nextLine();

        System.out.println("Enter Destination File for normal stream :");
        DestNameNormal = sobj.nextLine();

        System.out.println("Enter Destination File for buffered stream :");
        DestNameBuffered = sobj.nextLine();

        File fobj = new File(SrcName);

        if(fobj.exists())
        {
            File fdest = new File(DestNameNormal);
            File fdest2 = new File(DestNameBuffered);

            fdest.createNewFile();

            fdest2.createNewFile();

            FileInputStream fiobj = new FileInputStream(fobj);
            FileOutputStream foobj = new FileOutputStream(fdest);

            FileInputStream fiobj2 = new FileInputStream(fobj);
            FileOutputStream foobj2 = new FileOutputStream(fdest2);

            BufferedInputStream biobj = new BufferedInputStream(fiobj2);
            BufferedOutputStream boobj = new BufferedOutputStream(foobj2);

            long startTime = System.nanoTime();

            while((iRet = fiobj.read(Buffer)) != -1)
            {
                foobj.write(Buffer,0,iRet);
            }

            long endTime = System.nanoTime();

            long time = endTime-startTime;

            System.out.println("Time Required for buffered stream is : " + time + " nano seconds");

            long startTime2 = System.nanoTime();

            while((iRet = biobj.read(Buffer)) != -1)
            {
                boobj.write(Buffer,0,iRet);
            }

            long endTime2 = System.nanoTime();
            long time2 = endTime2-startTime2;

            System.out.println("Time Required for buffered stream is : " + time2 + " nano seconds");

            System.out.println("Data copied successfully");

            biobj.close();
            fiobj.close();
            
            boobj.close();
            foobj.close();
        }
        else
        {
            System.out.println("Their is no such file");
        }


    }
}