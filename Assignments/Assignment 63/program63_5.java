// 5. Write a program in Java which reads first 1 KB data from Combined.bin and writes it into a new output file.

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class program63_5
{
    public static void main(String A[]) throws IOException
    {
        String FileName = "Combined.bin";
        int iRet = 0;
        byte Buffer[] = new byte[1024];

        File fobj = new File(FileName);

        if(fobj.exists())
        {
            File fout = new File("output.txt");

            fout.createNewFile();

            FileInputStream fiobj = new FileInputStream(fobj);
            FileOutputStream foobj = new FileOutputStream(fout);

            iRet = fiobj.read(Buffer);

            foobj.write(Buffer, 0, iRet);

            fiobj.close();
            foobj.close();
        }
    }
}