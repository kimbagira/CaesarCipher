package caesarCipher;

public class Decryption {
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

}
