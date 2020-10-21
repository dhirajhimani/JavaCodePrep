package whiteboardsolutions.Ch02LinkedLists.Q5SumLists;

import solutions.CtCILibrary.CtCILibrary.LinkedListNode;

public class SumListsUsingIteration {


    private static LinkedListNode addLists(LinkedListNode l1, LinkedListNode l2) {

        LinkedListNode result = null;
        LinkedListNode head = null;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int sum = carry;

            if (l1 != null) {
                sum += l1.data;
            }
            if (l2 != null) {
                sum += l2.data;
            }

            LinkedListNode node = new LinkedListNode(sum%10);
            carry = sum / 10;

            if (result == null) {
                result = node;
                head = result;
            } else {
                result.next = node;
                result = result.next;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        if (carry != 0) {
            LinkedListNode node = new LinkedListNode(carry);
            result.next = node;
        }

        return head;
    }

    public static int linkedListToInt(LinkedListNode node) {
        int value = 0;
        if (node.next != null) {
            value = 10 * linkedListToInt(node.next);
        }
        return value + node.data;
    }

    public static void main(String[] args) {
        LinkedListNode lA1 = new LinkedListNode(8, null, null);
        LinkedListNode lA2 = new LinkedListNode(1, null, lA1);
        LinkedListNode lA3 = new LinkedListNode(7, null, lA2);

        LinkedListNode lB1 = new LinkedListNode(5, null, null);
        LinkedListNode lB2 = new LinkedListNode(9, null, lB1);
        LinkedListNode lB3 = new LinkedListNode(2, null, lB2);

        LinkedListNode list3 = addLists(lA1, lB1);

        System.out.println("  " + lA1.printForward());
        System.out.println("+ " + lB1.printForward());
        System.out.println("= " + list3.printForward());

        int l1 = linkedListToInt(lA1);
        int l2 = linkedListToInt(lB1);
        int l3 = linkedListToInt(list3);

        System.out.print(l1 + " + " + l2 + " = " + l3 + "\n");
        System.out.print(l1 + " + " + l2 + " = " + (l1 + l2));
    }
}
