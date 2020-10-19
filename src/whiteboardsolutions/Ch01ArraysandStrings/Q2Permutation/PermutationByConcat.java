package whiteboardsolutions.Ch01ArraysandStrings.Q2Permutation;

public class PermutationByConcat {

    public static boolean validPermutation(String pString1, String pString2) {
        if (pString1 == null && pString2 == null) {
            return true;
        }
        if (pString1 == null || pString2 == null) {
            return false;
        }
        if (pString1.length() != pString2.length()) {
            return false;
        }
        String actualString  = pString1 + pString2;

        int lastIndex = actualString.length() - 1;
        for (int i = 0; i < lastIndex/2; i++) {
            if (actualString.charAt(i) != actualString.charAt(lastIndex-i)) {
                return false;
            }
        }
        return true;
    }
}
