package hackerrank.arrays;


import java.util.Scanner;

public class NewYearChaos2 {

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] A) {

        int n = A.length;
        int cnt = 0;
        for(int i = n - 1; i >= 0; i--)
        {
            if(A[i] != (i + 1))
            {
                if(((i - 1) >= 0) && A[i - 1] == (i + 1))
                {
                    cnt++;
                    swap(A, i, i-1);
                }
                else if(((i - 2) >= 0) && A[i - 2] == (i + 1))
                {
                    cnt += 2;
                    A[i - 2] = A[i - 1];
                    A[i - 1] = A[i];
                    A[i] = i + 1;
                }
                else
                {
                    System.out.println("Too chaotic");
                    return;
                }
            }
        }
        System.out.println(String.format("%d",cnt));
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
