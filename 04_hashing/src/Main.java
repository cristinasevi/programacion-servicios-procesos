import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Main {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        String result = new Main().hash("Hola mundo");
        System.out.println(result);
    }

    public String hash(String content) throws NoSuchAlgorithmException {
        // MessageDigest digest = MessageDigest.getInstance("SHA-256");
        MessageDigest digest = MessageDigest.getInstance("MD5");

        byte[] encodedhash = digest.digest(content.getBytes(StandardCharsets.UTF_8));

        return bytesToHex(encodedhash);
    }

    private static String bytesToHex(byte[] hash) {
        StringBuilder hexString = new StringBuilder(2 * hash.length);
        for (int i = 0; i < hash.length; i++) {
            String hex = Integer.toHexString(0xff & hash[i]);
            if(hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }
        return hexString.toString();
    }
}