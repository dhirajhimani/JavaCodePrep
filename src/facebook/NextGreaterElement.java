package facebook;

public class NextGreaterElement {

    public static void main(String[] args) {
        int[] arr = new int[]{ 8, 5, 4, 7, 9, 2 };

        for (int i : nextGreaterElement(arr)) {
            System.out.println(i);
        }
    }

    public static int[] nextGreaterElement(int[] array) {

        int[] solution = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            int elem = array[i];

            boolean found = false;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > elem) {
                    solution[i] = array[j];
                    found = true;
                    break;
                }
            }
            if (!found) {
                solution[i] = -1;
            }

        }
        return solution;
    }
}
