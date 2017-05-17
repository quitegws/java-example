package list;

public class RemoveListedListElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode h1 = new ListNode(1);
		ListNode h12 = h1.next = new ListNode(1);
		
//		ListNode h13 = h12.next = new ListNode(5);
//		ListNode h14 = h13.next;
		
		ListNode h2 = new ListNode(5);
		ListNode h22 = h2.next = new ListNode(9);
		ListNode h23 = h22.next = new ListNode(2);
		ListNode h24 = h23.next;
		ListUtils.printSingleLinkedList(removeElements(h1, 1));
	}

    public static ListNode removeElements(ListNode head, int val) {
        // Write your code here
        if(head == null){
            return null;
        } 
        while (head != null && head.val == val) {
        	head = head.next;
        }
        
        ListNode point = head;
        while (point != null && point.next != null) {
        	if (point.next.val == val) {
        		point.next = point.next.next;
        	} else {
        		point = point.next;
        	}
        }
        
        return head;
    }
}
