package caesarCipher;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter a message");
        String text = bufferedReader.readLine();
        Encryption enter = new Encryption();
        String enter1=enter.Encryption(text,5);
        System.out.println(enter1);
        Decryption decrypted = new Decryption();
        System.out.println(decrypted.Decryption(enter1,5));
    }

}
