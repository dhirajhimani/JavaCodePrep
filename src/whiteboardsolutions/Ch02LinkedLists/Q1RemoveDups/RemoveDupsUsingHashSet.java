package whiteboardsolutions.Ch02LinkedLists.Q1RemoveDups;

import solutions.CtCILibrary.CtCILibrary.LinkedListNode;

import java.util.HashSet;

public class RemoveDupsUsingHashSet {


    private static void deleteDups(LinkedListNode head) {

        HashSet<Integer> hashSet = new HashSet<>();

        LinkedListNode previous = head;

        while (head != null) {
            if (hashSet.contains(head.data)) {
                previous.next = head.next;
            } else {
                hashSet.add(head.data);
                previous = head;
            }
            head = head.next;
        }

    }


    public static void main(String[] args) {
        LinkedListNode first = new LinkedListNode(0, null, null); //AssortedMethods.randomLinkedList(1000, 0, 2);
        LinkedListNode head = first;
        LinkedListNode second = first;
        for (int i = 1; i < 8; i++) {
            second = new LinkedListNode(i % 3, null, null);
            first.setNext(second);
            second.setPrevious(first);
            first = second;
        }
        System.out.println(head.printForward());
        deleteDups(head);
        System.out.println(head.printForward());
    }

}
