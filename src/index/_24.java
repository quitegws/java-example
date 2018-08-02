package index;

import list.ListNode;

/**
 * @Author: gws
 * @Date: 02/08/2018 00:32
 * @Description:
 */
public class _24 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    class Solution {
        public ListNode swapPairs(ListNode head) {
            if (head == null || head.next == null) {
                return head;
            }
            ListNode first = head;
            ListNode second = head.next;

            ListNode left = swapPairs(head.next.next);

            first.next = left;
            second.next = first;

            return second;

        }
    }
}
