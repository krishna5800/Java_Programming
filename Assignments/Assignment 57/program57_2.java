// 2. Write java program to accept file name from user and check whether 
// that file is regular file or not..

import java.io.File;
import java.util.Scanner;

class program57_2
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);
        File fobj = null;

        String FileName = null;

        System.out.println("Enter File Name : ");
        FileName = sobj.nextLine();

        fobj = new File(FileName);

        if(fobj.exists() && fobj.isFile())
        {
            System.out.println("Is Regular File");
        }
        else
        {
            System.out.println("Is not a Regular File");
        }

        sobj.close();
    }
}