package whiteboardsolutions.Ch02LinkedLists.Q2ReturnKthToLast;

import solutions.CtCILibrary.CtCILibrary.AssortedMethods;
import solutions.CtCILibrary.CtCILibrary.LinkedListNode;

public class ReturnKthToLastByRecursion {

    public static class Index {
        public int index = 0;
    }


    public static LinkedListNode nthToLast(LinkedListNode head, int n) {
        return nthToLast(head, n, new Index());

    }

    private static LinkedListNode nthToLast(LinkedListNode head, int n, Index index) {
        if (head == null) {
            return null;
        }

        LinkedListNode node = nthToLast(head.next, n, index);
        index.index++;
        if (index.index == n) {
            return head;
        }
        return node;
    }


    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6};
        LinkedListNode head = AssortedMethods.createLinkedListFromArray(array);
        for (int i = 0; i <= array.length + 1; i++) {
            LinkedListNode node = nthToLast(head, i);
            String nodeValue = node == null ? "null" : "" + node.data;
            System.out.println(i + ": " + nodeValue);
        }
    }

}
