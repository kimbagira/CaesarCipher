import java.util.ArrayList;
import java.util.List;
public class Decryption {
    public ArrayList<Object> runDecryption(String startUpTo){
        ArrayList<Object> output = new ArrayList<Object>();
        output.add("word");
        char alphabet;
        for (int i =0; i < "word".length(); i++){
            alphabet = "word".charAt(i);
            if (i>= 'a' && i<='z') {
                output.add("Decryption");
            }
            else {
                output.add(i);
            }
        }
        return output;
    }
}
