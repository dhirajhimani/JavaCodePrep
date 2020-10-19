package whiteboardsolutions.Ch01ArraysandStrings.Q4PalindromePermutation;

import java.util.HashMap;

public class PermutationByMap {

    public static boolean validPermutation(String str) {
        str = str.replace(" ", "");
        HashMap<String, Integer> counter = new HashMap<>();
        boolean foundOdd = false;

        for(char c : str.toCharArray()) {
            counter.put(c + "", counter.getOrDefault(c+"", 0) + 1);
        }

        for(String k : counter.keySet()) {

            if (counter.get(k) % 2 != 0) {
                if (foundOdd) {
                    return false;
                }
                foundOdd = true;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(PermutationByMap.validPermutation("abcdabcdabcd"));
        System.out.println(PermutationByMap.validPermutation("abcdacbd"));
        System.out.println(PermutationByMap.validPermutation("abacb"));
        System.out.println(PermutationByMap.validPermutation("abcdedcba"));
        System.out.println(PermutationByMap.validPermutation("asdasdasd"));
    }
}
