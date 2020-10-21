package whiteboardsolutions.Ch02LinkedLists.Q6Palindrome;

import solutions.CtCILibrary.CtCILibrary.LinkedListNode;

import java.util.Stack;

public class Palindrome {


    private static boolean isPalindrome(LinkedListNode head) {

        LinkedListNode slow = head;
        LinkedListNode fast = head;

        Stack<Integer> stack = new Stack();

        while (fast != null && fast.next != null) {
            stack.push(slow.data);
            slow = slow.next;
            fast = fast.next.next;
        }

        if (fast != null) {
            slow = slow.next;
        }

        while(slow != null) {
            if (stack.pop() != slow.data) {
                return false;
            }
            slow = slow.next;
        }

        return true;
    }

    public static void main(String[] args) {
        int length = 5;
        LinkedListNode[] nodes = new LinkedListNode[length];
        for (int i = 0; i < length; i++) {
            nodes[i] = new LinkedListNode(i >= length / 2 ? length - i - 1 : i, null, null);
        }

        for (int i = 0; i < length; i++) {
            if (i < length - 1) {
                nodes[i].setNext(nodes[i + 1]);
            }
            if (i > 0) {
                nodes[i].setPrevious(nodes[i - 1]);
            }
        }
        //nodes[length - 2].data = 9; // Uncomment to ruin palindrome

        LinkedListNode head = nodes[0];
        System.out.println(head.printForward());
        System.out.println(isPalindrome(head));
    }
}
