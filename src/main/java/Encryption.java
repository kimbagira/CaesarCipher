//import java.util.ArrayList;
//import java.util.List;
//public class Encryption {
//    public ArrayList<Object> runEncryption(int  startUpTo){
//        ArrayList<Object> output = new ArrayList<Object>();
//        output.add("word");
//        char alphabet;
//        for (int i =0; i < "word".length(); i++){
//            alphabet = "word".charAt(i);
//            if (i>= 'a' && i<='z') {
//                output.add("Encryption");
//            }
//            else {
//                output.add(i);
//            }
//        }
//        return output;
//    }
//}


public  class Encryption {
    public static String Encryption(String encryptText, int index) {
        if (index > 26) {
            index = index % 26;
        }
        else if (index < 0) {
            index = (index % 26) + 26;
        }
        String enterText = "";
        int length = encryptText.length();
        for (int a = 0; a < length; a++) {
            char charact = encryptText.charAt(a);
            if (Character.isLetter(charact)) {
                if (Character.isLowerCase(charact)) {
                    char c = (char) (charact + index);
                    if (c > 'z') {
                        enterText += (char) (charact - (26 - index));
                    }
                    else {
                        enterText += c;
                    }
                }
                else if (Character.isUpperCase(charact)) {
                    char c = (char) (charact + index);
                    if (c > 'z') {
                        enterText += (char) (charact - (26 - index));
                    }
                    else {
                        enterText += c;
                    }
                }
            }
            else {
                enterText += charact;
            }
        }
        return enterText;
    }

    public  static String  Decryption(String decryptText, int index){
        if (index >26){
            index=index % 26;
        }
        else if (index <0){
            index = (index % 26)+26;
        }
        String enterText="";
        int length = decryptText.length();
        for (int a=0; a<length; a++){
            char charact = decryptText.charAt(a);
            if(Character.isLetter(charact)){
                if(Character.isLowerCase(charact)) {
                    char c = (char) (charact - index);
                    if (c < 'a') {
                        enterText += (char) (charact - (26 - index));
                    }
                    else {
                        enterText += c;
                    }
                }
                else if (Character.isUpperCase(charact)){
                    char c = (char)(charact-index);
                    if(c<'A') {
                        enterText += (char) (charact - (26 - index));
                    }
                    else {
                        enterText+=c;
                    }
                }
            }

            else{
                enterText+=charact;
            }
        }
        return enterText;
    }

    public static void main(String[] args) {
        String text = "this is some message";
        String enter = Encryption(text, 5);
        System.out.println(enter);
        String decrypted = Decryption(enter, 5);
        System.out.println(decrypted);
    }
}