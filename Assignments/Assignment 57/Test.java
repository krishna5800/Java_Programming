import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

class Checksum
{
    String CalculateChecksum(String input)
    {
        try 
        {
            MessageDigest mobj = null;

            mobj = MessageDigest.getInstance("MD5");

            byte Input[] = input.getBytes(StandardCharsets.UTF_8);

            byte Output[] = mobj.digest(Input);

            StringBuilder sobj = new StringBuilder();

            for (byte b : Output)
            {
                sobj.append(String.format("%02x", b));
            }

            return sobj.toString();

        }
        catch(NoSuchAlgorithmException nobj)
        {
            throw new RuntimeException(nobj);
        }
        catch(Exception eobj)
        {
            throw new RuntimeException(eobj);
        }
    }
}

class Test
{
    public static void main(String A[])
    {
        String input = "Jay Ganesh...";
        String Ret = null;

        Checksum cobj = new Checksum();

        Ret = cobj.CalculateChecksum(input);

        System.out.println("Checksum for " + input + ": is : " + Ret);
    }
}