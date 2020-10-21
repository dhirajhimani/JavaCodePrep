package whiteboardsolutions.Ch02LinkedLists.Q4Partition;

import solutions.CtCILibrary.CtCILibrary.LinkedListNode;

public class PartitionUsingExtraVariables {


    private static LinkedListNode partition(LinkedListNode head, int n) {
        LinkedListNode bs = null;
        LinkedListNode be = null;
        LinkedListNode as = null;
        LinkedListNode ae = null;

        while(head != null) {
            LinkedListNode next = head.next;
            head.next = null;
            if (head.data < n) {
                if (bs == null) {
                    bs = head;
                    be = head;
                } else {
                    be.next = head;
                    be = head;
                }
            } else {
                if (as == null) {
                    as = head;
                    ae = head;
                } else {
                    ae.next = head;
                    ae = head;
                }
            }
            head = next;
        }
        if (bs == null) {
            return as;
        }

        be.next = as;

        return bs;
    }


    public static void main(String[] args) {
        /* Create linked list */
        int[] vals = {33,9,2,3,10,10389,838,874578,5};
        LinkedListNode head = new LinkedListNode(vals[0], null, null);
        LinkedListNode current = head;
        for (int i = 1; i < vals.length; i++) {
            current = new LinkedListNode(vals[i], null, current);
        }
        System.out.println(head.printForward());

        /* Partition */
        LinkedListNode h = partition(head, 35);

        /* Print Result */
        System.out.println(h.printForward());
    }

}
