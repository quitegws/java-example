package list;

public class ReverseLinkedLIst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListNode head = ListUtils.generateSingleLinkedList(new int[]{1,2,3,3,4,4,4,5,5,9});
		ListUtils.printSingleLinkedList(reverse(head));
	}

    public static ListNode reverse(ListNode head) {
        // write your code here
    	ListNode point = null;
    	
    	while (head != null) {
    		ListNode tmp = head.next;
    		head.next = point;
    		
    		point = head;
    		
    		head = tmp;
    		
    		
    	}
    	
    	return point;
    }
}
