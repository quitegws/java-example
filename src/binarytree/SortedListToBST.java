package binarytree;

import list.ListNode;

/**
 * @Author: gws
 * @Date: 22/04/2018 00:52
 * @Description:
 */
public class SortedListToBST {

    public TreeNode sortedListToBST(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return new TreeNode(head.val);
        ListNode mid = head;
        ListNode end = head;
        ListNode preMid = null;
        while (end != null && end.next != null) {
          preMid = mid;
          mid = mid.next;
          end = end.next.next;
        }
        TreeNode root = new TreeNode(mid.val);
        preMid.next = null;
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(mid.next);
        return root;
  }
}
