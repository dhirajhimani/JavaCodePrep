package hackerrank.arrays;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class TwoStrings {

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
        char[] small = s1.length() < s2.length() ? s1.toCharArray() : s2.toCharArray();
        char[] large = s1.length() < s2.length() ? s2.toCharArray() : s1.toCharArray();

        Arrays.sort(small);
        Arrays.sort(large);

        int index = 0;
        for (int i = 0; i < small.length; i++) {
            for (int j = index; j < large.length; j++) {

                if (small[i] == large[j]) {
                    return "YES";
                } else if (small[i] > large[j]) {
                    index = j;
                } else {
                    break;
                }
            }
        }
        return "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);


//    2
//    hello
//    world
//    hi
//    world
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = scanner.nextLine();

            String s2 = scanner.nextLine();

            String result = twoStrings(s1, s2);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
