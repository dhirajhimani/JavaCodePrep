package facebook;

public class Palindrome {

    public static void main(String[] args) {

        String palindrome = "tacocats";
        boolean valid = isValidPalindrome(palindrome.toCharArray());
        System.out.println(valid);

    }
// t a z c f c a t
// t a z c c a t

    public static boolean isValidPalindrome(char[] palindrome) {

        int start = 0;
        int end = palindrome.length - 1;
        boolean foundError = false;
        int mid = palindrome.length / 2;

        for (int i = 0; i < mid; i++) {

            if (palindrome[start] != palindrome[end]) {
                if (foundError) {
                    return false;
                }
                foundError = true;
                if (palindrome[end-1] == palindrome[start]) {
                    end--;
                } else if (palindrome[start + 1] == palindrome[end]) {
                    start++;
                }
            } else {
                start++;
                end--;
            }
        }
        return true;
    }



}
