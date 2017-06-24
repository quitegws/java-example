package list;

public class HasCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
		ListNode tail = new ListNode(2);
		tail.next = head;
		head.next = tail;
		System.out.println(new HasCycle().hasCycle(head));
	}
    public Boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode fast, slow;
        fast = head.next;
        slow = head;
        while (fast != slow) {
            if(fast==null || fast.next==null)
                return false;
            fast = fast.next.next;
            slow = slow.next;
        } 
        return true;
    }
}
