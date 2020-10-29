package hackerrank;

import java.util.*;


public class ToyShop {

    public static void main(String[] args) {
        int[] costOfToys = new int[26];
        Arrays.fill(costOfToys, 1);
        costOfToys[0] = 5;
        costOfToys[1] = 4;
        costOfToys[2] = 4;
        costOfToys[3] = 5;
        String toys = "aabcda";
        System.out.println(toyShop(6, 10, toys.toCharArray(), costOfToys));
    }

    static class Pair {
        public int cost;
        public int no_of_toys;
        public String toys;

        public Pair(int cost, int no_of_toys, String toys) {
            this.cost = cost;
            this.no_of_toys = no_of_toys;
            this.toys = toys;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "cost=" + cost +
                    ", no_of_toys=" + no_of_toys +
                    ", toys=" + toys +
                    '}';
        }
    }

    public static int toyShop(final int N, final int M, final char[] toys, final int[] costOfToys) {
        // Write your code here
        int windowLength = N;
        Pair pair = new Pair(0, 0, "");
        while (windowLength > 0) {
            getToysCostAndCount(N, M, toys, costOfToys,
                    0, windowLength,
                    pair);

            windowLength--;
        }

        System.out.println("pair = " + pair);
        return pair.no_of_toys;
    }

    private static void getToysCostAndCount(int N,
                                            int M,
                                            char[] toys,
                                            int[] costOfToys,
                                            int start,
                                            int end,
                                            Pair pair) {

        if (end > N) {
            return;
        }
        Pair tempPair = getToysCostAndCount(toys, costOfToys, start, end);
        if (tempPair.no_of_toys > pair.no_of_toys && tempPair.cost < M) {
            pair.cost = tempPair.cost;
            pair.no_of_toys = tempPair.no_of_toys;
            pair.toys = tempPair.toys;
        }
        getToysCostAndCount(N,
                M,
                toys, costOfToys, start + 1, end + 1, pair);
    }

    private static Pair getToysCostAndCount(char[] toys, int[] costOfToys, int start, int end) {
        int total = 0;
        StringBuilder toyToBuy = new StringBuilder();
        boolean foundRepeat;
        for (int i = start; i < end; i++) {
            toyToBuy.append(toys[i]);
        }
        char[] finaltoys = filterToysList(toyToBuy.toString().toCharArray()).toCharArray();
        for (int i = 0; i < finaltoys.length; i++) {
            int toy = finaltoys[i] - 'a';
            total += costOfToys[toy];
        }
        int freeToys = end - start - finaltoys.length;
        return new Pair(total, finaltoys.length + freeToys, new String(finaltoys));

    }

    private static String filterToysList(char[] toyToBuy2) {
        char[] toyToBuy = new String(toyToBuy2).toCharArray();
        int repeatCount = 1;
        int highestCount = 1;
        int repeatIndex = -1;
        char previous = '0';
        for (int i = 0; i < toyToBuy.length; i++) {
            if (toyToBuy[i] == previous) {
                repeatCount++;
            } else {
                previous = toyToBuy[i];
                if (repeatCount > highestCount) {
                    highestCount = repeatCount;
                    repeatIndex = i - repeatCount;
                }
                repeatCount = 1;
            }
        }
        if (repeatIndex != -1) {
            for (int i = repeatIndex; i < highestCount; i++) {
                toyToBuy[i] = '0';
            }
        }

        return new String(toyToBuy).replace("0", "");
    }
}
