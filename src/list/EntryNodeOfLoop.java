package list;

/**
 * @Author: gws
 * @Date: 24/03/2018 11:01
 * @Description:
 */
public class EntryNodeOfLoop {

    public ListNode EntryNodeOfLoop(ListNode head)
    {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode fast, slow;
        fast = head.next;
        slow = head;
        while (fast != slow) {
            if(fast==null || fast.next==null)
                return null;
            fast = fast.next.next;
            slow = slow.next;
        }
        return fast;
    }

}
