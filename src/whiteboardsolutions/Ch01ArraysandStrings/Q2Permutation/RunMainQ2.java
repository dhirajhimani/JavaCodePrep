package whiteboardsolutions.Ch01ArraysandStrings.Q2Permutation;

public class RunMainQ2 {

    public static void main(String[] args) {

        assert(PermutationByArray.validPermutation("abcd", "cbda"));
        assert(PermutationByArray.validPermutation("abcd", "dcba"));
        assert(!PermutationByArray.validPermutation("abcde", "dcba"));
        assert(!PermutationByArray.validPermutation("abab", "cdcd"));
    }

}