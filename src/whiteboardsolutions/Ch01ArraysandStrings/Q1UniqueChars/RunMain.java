package whiteboardsolutions.Ch01ArraysandStrings.Q1UniqueChars;

public class RunMain {

    public static void main(String[] args) {

        String stringWithDuplicateChars = "asdasdas";
        String stringWithUniqueChars = "asdfghj";

        assert (Q1_UsingBitVector.hasUniqueChars(stringWithUniqueChars));
        assert (!Q1_UsingBitVector.hasUniqueChars(stringWithDuplicateChars));


        assert (Q1_UsingBooleanArray_NotRecommended.hasUniqueChars(stringWithUniqueChars));
        assert (!Q1_UsingBooleanArray_NotRecommended.hasUniqueChars(stringWithDuplicateChars));


        assert (Q1_UsingBooleanArray_NotRecommended.hasUniqueChars(stringWithUniqueChars) == Q1_UsingBitVector.hasUniqueChars(stringWithUniqueChars));
        assert (!Q1_UsingBooleanArray_NotRecommended.hasUniqueChars(stringWithDuplicateChars) == !Q1_UsingBitVector.hasUniqueChars(stringWithDuplicateChars));

        String[] words = {"abcde", "hello", "apple", "kite", "padle"};
        for (String word : words) {
            System.out.println(word + ": " + Q1_UsingBitVector.hasUniqueChars(word));
            System.out.println(word + ": " + Q1_UsingBooleanArray_NotRecommended.hasUniqueChars(word));
        }
    }

}
