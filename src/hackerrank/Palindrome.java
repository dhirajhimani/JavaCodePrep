package hackerrank;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPlaindrome("abba") + "");
        System.out.println(isPlaindrome("abcba") + "");
        System.out.println(isPlaindrome("dabba") + "");
        System.out.println(isPlaindrome("abcdba") + "");
    }

    static int isPlaindrome(String S) {
        // code here
        char[] chars = S.toCharArray();
        int halfSize = S.length() / 2;
        for (int i = 0; i < halfSize; i++) {
            if (chars[i] != chars[S.length() - i - 1]) {
                return 0;
            }
        }
        return 1;
    }
}
