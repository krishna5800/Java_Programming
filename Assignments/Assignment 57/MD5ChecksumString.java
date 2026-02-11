import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5ChecksumString 
{
    public static void main(String[] args) 
    {
        String input = "Hello, world!";
        
        try {
            // Get an MD5 MessageDigest instance
            MessageDigest md = MessageDigest.getInstance("MD5");

            // Compute the hash as a byte array
            byte[] hash = md.digest(input.getBytes(StandardCharsets.UTF_8));

            // Convert the byte array into a sign-magnitude representation (BigInteger)
            BigInteger bigInt = new BigInteger(1, hash);

            // Convert the BigInteger into a hexadecimal string
            String checksum = bigInt.toString(16);

            // Pad with leading zeros if necessary to ensure a 32-character string
            while (checksum.length() < 32) 
            {
                checksum = "0" + checksum;
            }

            System.out.println("MD5 Checksum for \"" + input + "\": " + checksum);

        } 
        catch(NoSuchAlgorithmException e) 
        {
            e.printStackTrace();
        }
    }
}
