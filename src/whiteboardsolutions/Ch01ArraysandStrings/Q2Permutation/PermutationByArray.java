package whiteboardsolutions.Ch01ArraysandStrings.Q2Permutation;

public class PermutationByArray {

    public static boolean  validPermutation(String pString1, String pString2) {

        if (pString1 == null && pString2 == null) {
            return true;
        }
        if (pString1 == null || pString2 == null) {
            return false;
        }
        if (pString1.length() != pString2.length()) {
            return false;
        }

        int[] uniqueCount = new int[128];

        for(int i=0; i < pString1.length(); i++) {
            uniqueCount[pString1.charAt(i)]++;
        }

        for(int i=0; i < pString2.length(); i++) {
            int c = pString2.charAt(i);
            if (--uniqueCount[c] < 0) {
                return false;
            }
        }
        return true;
    }
}
