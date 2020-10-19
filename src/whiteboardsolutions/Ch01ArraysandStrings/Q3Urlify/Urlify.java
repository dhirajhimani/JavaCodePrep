package whiteboardsolutions.Ch01ArraysandStrings.Q3Urlify;

public class Urlify {

    public static String urlifyString(String str, int trueLength) {

        char[] charArray = str.toCharArray();
        int spaces = 0;
        for (int i = 0; i < trueLength; i++) {
            if(charArray[i] == ' ') {
                spaces++;
            }
        }
        int finalLength = trueLength + spaces*2;

        assert(finalLength <= str.length());

        for(int i = trueLength - 1; i > 0; i--) {
            if (charArray[i] == ' ') {
                charArray[finalLength - 1] = '0';
                charArray[finalLength - 2] = '2';
                charArray[finalLength - 3] = '%';
                finalLength -= 3;
            } else {
                charArray[finalLength - 1] = charArray[i];
                finalLength -= 1;
            }
        }
        return new String(charArray);
    }

    public static int getTrueLength(String str) {
        for (int i = str.length() - 1; i > 0; i--) {
            if (str.charAt(i) != ' ') {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String stringToUrlify = "Mr John Smith    ";
        System.out.println("stringToUrlify.length() = " + stringToUrlify.length());
        int trueLength = getTrueLength(stringToUrlify) + 1;
        String url = urlifyString(stringToUrlify, trueLength);
        System.out.println("url = " + url.length());
        System.out.println("url = " + url);

    }

}
