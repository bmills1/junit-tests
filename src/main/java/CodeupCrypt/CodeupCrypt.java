package CodeupCrypt;

public class CodeupCrypt {
    public static String hash = "";

    // Takes in a String and hashes the password, returns the finished hash.
    public static String getHash(String originalStr) {
        hash = "";
        for (char character : originalStr.toCharArray()) {
            switch (character) {
                case 'a':
                case 'A':
                    hash += 4;
                    break;
                case 'e':
                case 'E':
                    hash += 3;
                    break;
                case 'i':
                case 'I':
                    hash += 1;
                    break;
                case 'o':
                case 'O':
                    hash += 0;
                    break;
                case 'u':
                case 'U':
                    hash += 9;
                    break;
                default:
                    hash += character;
            }
        }
        return hash;
    }


    public static boolean checkPassword(String password) {
        return getHash(password).equals(password);
    }
}
