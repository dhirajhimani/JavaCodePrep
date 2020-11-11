package hackerrank.arrays;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SherlockandAnagrams {

    // Complete the sherlockAndAnagrams function below.
    static int sherlockAndAnagrams(String s) {
        int count = 0;
        for (int i = 1; i < s.length(); i++) {
            for (int j = 0; j + i <= s.length(); j ++) {
                String s1 = s.substring(j, j + i);
                String temp1 = s1;
                for (int k = j + 1; k + i <= s.length(); k++) {
                    String s2 = s.substring(k, k + i);
                    if (areAnagrams(s1, s2)) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    static boolean areAnagrams(String s1, String s2) {
        // Get lenghts of both strings
        char[] str1 = s1.toCharArray();
        char[] str2 = s2.toCharArray();
        int n1 = str1.length;
        int n2 = str2.length;

        // If length of both strings is not same,
        // then they cannot be anagram
        if (n1 != n2)
            return false;

        // Sort both strings
        Arrays.sort(str1);
        Arrays.sort(str2);

        return Arrays.equals(str1, str2);
    }

    private static final Scanner scanner = new Scanner(System.in);

    // https://www.hackerrank.com/challenges/sherlock-and-anagrams/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=dictionaries-hashmaps
//    2
//    ifailuhkqq
//    kkkk

//    1
//    ifailuhkqq

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = sherlockAndAnagrams(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }

}
