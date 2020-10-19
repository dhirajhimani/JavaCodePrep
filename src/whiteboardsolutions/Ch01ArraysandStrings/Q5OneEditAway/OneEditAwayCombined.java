package whiteboardsolutions.Ch01ArraysandStrings.Q5OneEditAway;

public class OneEditAwayCombined {

    public static boolean isOneEditAway(String str1, String str2) {

        if (str1.length() - str2.length() > 1) {
            return false;
        }

        String smaller = "";
        String longer = "";

        if (str1.length() < str2.length()) {
            smaller = str1;
            longer = str2;
        } else {
            smaller = str2;
            longer = str1;
        }

        int indexS = 0;
        int indexL = 0;
        boolean isNotCorrect = false;

        while (indexS < smaller.length() && indexL < longer.length()) {
            if (smaller.charAt(indexS) != longer.charAt(indexL)) {
                if (isNotCorrect) {
                    return false;
                }
                isNotCorrect = true;
                if (smaller.length() == longer.length()) {
                    indexS++;
                }
            } else {
                indexS++;
            }
            indexL++;
        }
        return true;
    }

    public static void main(String[] args) {

        boolean isReplace = isOneEditAway("dhirb", "dhira");
        System.out.println("isReplace = " + isReplace);

        boolean isOneInsertAway = isOneEditAway("dhirj", "dhiraj");
        System.out.println("isOneInsertAway = " + isOneInsertAway);

        boolean isOneRemoveAway = isOneEditAway("dhiraj", "dhirj");
        System.out.println("isOneRemoveAway = " + isOneRemoveAway);

        boolean isReplace2 = isOneEditAway("dhisa", "dhirb");
        System.out.println("isReplace2 = " + isReplace2);

        boolean isOneInsertAway2 = isOneEditAway("dhirj", "dhiraaj");
        System.out.println("isOneInsertAway2 = " + isOneInsertAway2);

        boolean isOneRemoveAway2 = isOneEditAway("dhiraj", "dhij");
        System.out.println("isOneRemoveAway2 = " + isOneRemoveAway2);

    }
}
