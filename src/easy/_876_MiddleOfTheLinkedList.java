package easy;

import utils.ListNode;

public class _876_MiddleOfTheLinkedList {
    /**
     * 876. Middle of the Linked List
     * @param head of a singly linked list
     * @return the middle node of the linked list
     */
    public ListNode middleNode(ListNode head) {
        ListNode next = head;
        int len = 0;

        while (head != null) {
            len++;
            head = head.next;
        }

        for (int i = 0; i < len / 2; i++) {
            next = next.next;
        }

        return next;
    }
}
