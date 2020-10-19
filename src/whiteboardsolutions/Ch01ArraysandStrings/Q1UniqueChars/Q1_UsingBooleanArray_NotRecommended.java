package whiteboardsolutions.Ch01ArraysandStrings.Q1UniqueChars;

public class Q1_UsingBooleanArray_NotRecommended {

    public static boolean hasUniqueChars(String str) {

        boolean[] charArr = new boolean[128];

        for (int i = 0; i < str.length(); i++) {
            int c = str.charAt(i);
            if (charArr[c]) {
                return false;
            }
            charArr[c] = true;
        }
        return true;
    }


}
