package easy;

import utils.ListNode;

public class _83_RemoveDuplicatesFromSortedList {
    /**
     * 83. Remove Duplicates from Sorted List
     * @param head of a sorted linked list
     * delete all duplicates such that each element appears only once
     * @return the linked list sorted as well
     */
    public ListNode deleteDuplicates(ListNode head) {
        ListNode node = head;

        while (node != null) {
            if (node.next == null) {
                break;
            }
            if (node.val == node.next.val) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }

        return head;
    }
}
