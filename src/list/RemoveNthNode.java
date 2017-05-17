package list;

public class RemoveNthNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = new int[]{1,2,3,4,5,6};
		int[] data2 = new int[]{1};
		ListNode head = ListUtils.generateSingleLinkedList(data2);
		ListUtils.printSingleLinkedList(head);
		ListNode head2 = removeNthFromEnd(head, 1);
		ListUtils.printSingleLinkedList(head2);

	}

    static ListNode removeNthFromEnd(ListNode head, int n) {
        // write your code here
        if (head == null || n <= 0) {
            return null;
        }

        ListNode preNode = new ListNode();
        ListNode p1 = preNode;
        preNode.next = head;
        
        for (int i = 0; i < n; i++) {
        	if (head == null) {
        		return head;
        	}
        	head = head.next;
        }
        
        while (head != null) {
        	head = head.next;
        	p1 = p1.next;
        }
        
        p1.next = p1.next.next;
        
        return preNode.next;
    }
}
