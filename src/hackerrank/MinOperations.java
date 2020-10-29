//package hackerrank;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class MinOperations {
//
//    public static void main(String[] args) {
////        ArrayList<Integer> arr = new ArrayList<>();
////        arr.add(64);
////        arr.add(30);
////        arr.add(25);
////        arr.add(33);
////        System.out.println(minOperations(arr, 2,2));
//
//        ArrayList<Integer> arr1 = new ArrayList<>();
//        arr1.add(1);
//        arr1.add(2);
//        arr1.add(3);
//        arr1.add(4);
//        System.out.println(minOperations(arr1, 4,3));
//
//        //System.out.println(findMatch(new int[]{1,1,1,2,2,3,4}));
//    }
//
//
//    public static int minOperations(List<Integer> arr, int threshold, int d) {
//        // Write your code here
//        int[] array = new int[arr.size()];
//        for (int i = 0; i < arr.size(); i++) {
//            array[i] = arr.get(i);
//        }
//        Arrays.sort(array);
//        int index = 1;
//        int total = 0;
//        while (threshold != 0) {
//            int operation = getOperation(array, index, d);
//            if (operation > 0) {
//                total += operation;
//
//                for (int i = 0; i < array.length; i++) {
//                    array[i] /= d;
//                }
//                Arrays.sort(array);
//                index = 1;
//            } else {
//                index++;
//            }
//
//            int match = findMatch(array);
//            threshold -= match;
//        }
//        return total;
//    }
//
//    public static int findMaxConsecutiveMatch(int[] array) {
//        int numDup = 0;
//        int dupCount = 0;
//        int previous = -1;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == previous) {
//                numDup++;
//                if (numDup == 1) {
//                    dupCount += 2;
//                } else {
//                    dupCount++;
//                }
//            } else {
//                previous = array[i];
//                numDup = 0;
//            }
//        }
//        return dupCount;
//    }
//
//    public static int getOperation(int[] arr, int start, int d) {
//        int elem = arr[start - 1];
//        int operation = 0;
//        for (int i = start; i < arr.length; i++) {
//            int afterdivide1 = arr[i] / d;
//            int afterdivide2 = arr[i] / d + 1;
//            if (elem == afterdivide1 ||elem == afterdivide2) {
//                operation++;
//            }
//        }
//        return operation;
//    }
//
//}
//
