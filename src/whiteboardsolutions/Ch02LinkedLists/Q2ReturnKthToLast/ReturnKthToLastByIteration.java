package whiteboardsolutions.Ch02LinkedLists.Q2ReturnKthToLast;

import solutions.CtCILibrary.CtCILibrary.AssortedMethods;
import solutions.CtCILibrary.CtCILibrary.LinkedListNode;

public class ReturnKthToLastByIteration {

    public static LinkedListNode nthToLast(LinkedListNode head, int n) {

        LinkedListNode startNode = head;
        LinkedListNode runnerNode = head;

        while (n != 0 && runnerNode != null) {
            runnerNode = runnerNode.next;
            n--;
        }

        if (runnerNode == null && n !=0) {
            return null;
        }

        while(runnerNode != null) {
            startNode = startNode.next;
            runnerNode = runnerNode.next;
        }

        return startNode;
    }


    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3};
        LinkedListNode head = AssortedMethods.createLinkedListFromArray(array);
        for (int i = 0; i <= array.length + 1; i++) {
            LinkedListNode node = nthToLast(head, i);
            String nodeValue = node == null ? "null" : "" + node.data;
            System.out.println(i + ": " + nodeValue);
        }
    }

}
