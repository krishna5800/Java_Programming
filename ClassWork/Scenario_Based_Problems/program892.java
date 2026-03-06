import java.io.*;

class program892
{
    public static void main(String A[]) throws IOException
    {
        String FileName = "Marvellous.csv";

        FileWriter fwobj = new FileWriter(FileName);

        fwobj.write("name, marks\n");
    }
}