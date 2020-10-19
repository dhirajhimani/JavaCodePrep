package whiteboardsolutions.Ch01ArraysandStrings.Q2Permutation;

public class RunMainQ2 {

    public static void main(String[] args) {

        assert(PermutationByConcat.validPermutation("abcd", "dcba"));
        assert(!PermutationByConcat.validPermutation("abcde", "dcba"));
        assert(!PermutationByConcat.validPermutation("abab", "cdcd"));

        assert(PermutationByArray.validPermutation("abcd", "dcba"));
        assert(!PermutationByArray.validPermutation("abcde", "dcba"));
        assert(!PermutationByArray.validPermutation("abab", "cdcd"));


        assert(!PermutationByConcat.validPermutation("abab", "cdcd"));
        assert(!PermutationByArray.validPermutation("abab", "cdcd"));
    }

}