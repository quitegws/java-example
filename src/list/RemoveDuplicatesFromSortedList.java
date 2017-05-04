package list;

public class RemoveDuplicatesFromSortedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListNode h1 = new ListNode(1);
		ListNode h12 = h1.next = new ListNode(1);
		ListNode h13 = h12.next = new ListNode(5);
		ListNode h14 = h13.next = new ListNode(5);
		
		ListNode head = ListUtils.generateSingleLinkedList(new int[]{1,2,3,3,4,4,4,5,5,9});
		ListUtils.printSingleLinkedList(deleteDuplicates(head));
		
	}

    public static ListNode deleteDuplicates(ListNode head) { 
        // write your code here
    	if (head == null) {
    		return null;
    	}
    	if (head.next == null) {
    		return head;
    	}
    	
    	int cur = 0;
    	ListNode point = new ListNode(head.val);
    	point = head;
    	while (point.next != null) {
    		cur = point.val;
    		if (cur == point.next.val) {
    			//
    			point.next = point.next.next;
    		} else {
    			point = point.next;
    		}
    	}
    	
    	return head;
    }
}
