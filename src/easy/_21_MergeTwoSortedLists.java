package easy;

import utils.ListNode;

public class _21_MergeTwoSortedLists {
    /**
     * 21. Merge Two Sorted Lists
     * @param list1 heads of sorted linked lists
     * @param list2 heads of sorted linked lists
     * @return the head of the merged linked list
     */
    public ListNode megreTwoSortedList(ListNode list1, ListNode list2) {
        ListNode sortedList = new ListNode(Integer.MIN_VALUE);

        ListNode headSortedList = sortedList;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                sortedList.next = list1;
                list1 = list1.next;
            } else {
                sortedList.next = list2;
                list2 = list2.next;
            }
            sortedList = sortedList.next;
        }

        if (list1 == null) {
            sortedList.next = list2;
        } else {
            sortedList.next = list1;
        }

        return headSortedList.next;
    }
}


