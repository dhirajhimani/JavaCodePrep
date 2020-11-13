package hackerrank.arrays;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SherlockAndTheValidString {

    // Complete the isValid function below.
    static String isValid(String s) {
        int[] letters = new int[26];
        int[] count = new int[26];
        HashMap<Integer, Integer> countMap = new HashMap();


        for (int i = 0; i < s.length(); i++) {
            int w = s.charAt(i) - 'a';
            letters[w] = letters[w] + 1;
        }
        for (int i = 0; i < letters.length; i++) {
            int c = letters[i];

            if (c == 0)
                continue;

            if (countMap.containsKey(c)) {
                countMap.put(c, countMap.get(c) + 1);
            } else {
                countMap.put(c, 1);
            }
        }

        if (countMap.size() > 2) {
            return "NO";
        } else if (countMap.size() == 2) {
            int key1 = (Integer)countMap.keySet().toArray()[0];
            int key2 = (Integer)countMap.keySet().toArray()[1];
            int value1 = countMap.get(key1);
            int value2 = countMap.get(key2);
            if (value1 - 1 == 0 || value2 - 1 == 0) {
                if (value1 - 1 == 0) {
                    if (key1 - 1 == 0 || key1 - 1 == key2) {
                        return "YES";
                    }
                } else {
                    if (key2 - 1 == 0 || key2 - 1 == key1) {
                        return "YES";
                    }
                }
            }
            return "NO";
        } else {
            return "YES";
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    // aabbccddeefghi
    // abcdefghhgfedecba
//    https://www.hackerrank.com/challenges/sherlock-and-valid-string/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=strings
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = scanner.nextLine();

        String result = isValid(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }

}
