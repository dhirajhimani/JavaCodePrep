package whiteboardsolutions.Ch01ArraysandStrings.Q1UniqueChars;

public class Q1_UsingBitVector {

    public static boolean hasUniqueChars(String str) {

        int checker = 0;

        for (int i =0; i < str.length(); i++) {
            int val = str.charAt(i) - 'a';
            if ((checker & (1 << val)) > 0) {
                return false;
            }
            checker |= (1 << val);
        }
        return true;
    }

}
