package whiteboardsolutions.Ch01ArraysandStrings.Q5OneEditAway;

public class OneEditAwayModule {

    public static boolean isOneEditAway(String str1, String str2) {
        if (str1.length() == str2.length()) {
            return isReplace(str1, str2);
        } else if (str1.length() + 1 == str2.length()) {
            return isInsertEdit(str1, str2);
        } else if (str2.length() + 1 == str1.length()) {
            return isInsertEdit(str2, str1);
        } else {
            return false;
        }
    }

    private static boolean isInsertEdit(String smaller, String longer) {
        int indexS = 0;
        int indexL = 0;
        boolean hasOneWordEditable = false;
        while(indexS < smaller.length() && indexL<longer.length()) {
            if(smaller.charAt(indexS) == longer.charAt(indexL)) {
                indexL++;
                indexS++;
            } else {
//                if (hasOneWordEditable) {
//                    return false;
//                }
                if (indexS != indexL) {
                    return false;
                }
                hasOneWordEditable = true;
                indexL++;
            }
        }
        return true;
    }

    private static boolean isReplace(String first, String second) {
        boolean hasOneWordReplaceable = false;

        for (int i = 0; i < first.length(); i++) {
            String f = first.charAt(i) + "";
            String s = second.charAt(i) + "";
            if (!f.equals(s)) {
                if (hasOneWordReplaceable) {
                    return false;
                }
                hasOneWordReplaceable = true;
            }
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
