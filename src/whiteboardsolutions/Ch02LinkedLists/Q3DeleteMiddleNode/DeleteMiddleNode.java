package whiteboardsolutions.Ch02LinkedLists.Q3DeleteMiddleNode;

import solutions.CtCILibrary.CtCILibrary.AssortedMethods;
import solutions.CtCILibrary.CtCILibrary.LinkedListNode;

public class DeleteMiddleNode {


    private static boolean deleteNode(LinkedListNode nodeToDelete) {

        if (nodeToDelete == null || nodeToDelete.next == null) {
            return false;
        }

        LinkedListNode next = nodeToDelete.next;

        nodeToDelete.data = next.data;
        nodeToDelete.next = next.next;

        return true;
    }

    public static void main(String[] args) {
        LinkedListNode head = AssortedMethods.randomLinkedList(10, 0, 10);
        System.out.println(head.printForward());
        deleteNode(head.next.next.next.next); // delete node 4
        System.out.println(head.printForward());
    }
}
