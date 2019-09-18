package caesarCipher;

public class Decryption {
    public  static String  Decryption(String Text, int word){
        if (word >26){
            word=word % 26;
        }
        else if (word <0){
            word = (word % 26)+26;
        }
        String enterText="";
        int length = Text.length();
        for (int a=0; a<length; a++){
            char carat = Text.charAt(a);
            if(Character.isLetter(carat)){
                if(Character.isLowerCase(carat)) {
                    char c = (char) (carat - word);
                    if (c < 'a') {
                        enterText += (char) (carat - (26 - word));
                    }
                    else {
                        enterText += c;
                    }
                }
                    char c = (char)(carat-word);
                    if(c<'A') {
                        enterText += (char) (carat - (26 - word));
                }
            }
        }
        return enterText;
    }

}
