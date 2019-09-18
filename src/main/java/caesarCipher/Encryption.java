package caesarCipher;

public class Encryption {

    public static String Encryption(String encryptText, int word) {
        if (word > 26) {
            word = word % 26;
        }
        else if (word < 0) {
            word = (word % 26) + 26;
        }
        String enterText = "";
        int length = encryptText.length();
        for (int a = 0; a < length; a++) {
            char carat = encryptText.charAt(a);
            if (Character.isLetter(carat)) {
                if (Character.isLowerCase(carat)) {
                    char c = (char) (carat + word);
                    if (c > 'z') {
                        enterText += (char) (carat - (26 - word));
                    }
                    else {
                        enterText += c;
                    }
                }
                    char c = (char) (carat + word);
                    if(c > 'z') {
                        enterText += (char) (carat - (26 - word));
                }
            }
        }
        return enterText;
    }




}
