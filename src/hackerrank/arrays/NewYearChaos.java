package hackerrank.arrays;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class NewYearChaos {

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {

        int minimumBribes = 0;
        for (int i = 1; i <= q.length; i++) {
            int bribe = q[i-1] - i;
            if (bribe > 2) {
                System.out.println("Too chaotic");
                return;
            }
        }
        int count = 0;
        for (int i = 0; i < q.length; i++) {
            count++;

            for (int j = 1; j < q.length; j++) {
                if (q[i] - count == 0) {
                    i++;
                }
                if (q[j-1] > q[j]) {
                    swap(q, j-1, j);
                    minimumBribes++;
                }
            }
        }

        System.out.println(minimumBribes + "");
    }

    public static void swap(int[] q, int a, int b) {
        int temp = q[a];
        q[a] = q[b];
        q[b] = temp;
    }


    private static final Scanner scanner = new Scanner(System.in);

    // https://www.hackerrank.com/challenges/new-year-chaos/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays

//    2
//    8
//    5 1 2 3 7 8 6 4
//    8
//    1 2 5 3 7 8 6 4

//    1
//    8
//    1 2 5 3 7 8 6 4
    
//    answers ->
//    Too chaotic
//    7
    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }
}
