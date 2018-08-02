package index;

import list.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @Author: gws
 * @Date: 02/08/2018 00:21
 * @Description:
 */
public class _23 {
    class Solution {
        public ListNode mergeKLists(ListNode[] lists) {
            PriorityQueue<ListNode> heap = new PriorityQueue(new Comparator<ListNode>() {
                @Override
                public int compare(ListNode o1, ListNode o2) {
                    return o1.val - o2.val;
                }
            });

            for (ListNode node : lists) {
                if (node != null) {
                    heap.offer(node);
                }
            }

            ListNode pre = new ListNode(-1);
            ListNode temp = pre;
            while (!heap.isEmpty()) {
                ListNode curr = heap.poll();
                temp.next = new ListNode(curr.val);
                if (curr.next != null) {
                    heap.offer(curr.next);
                }
                temp = temp.next;
            }
            return pre.next;
        }
    }
}
