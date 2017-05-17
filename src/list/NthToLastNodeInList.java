package list;

public class NthToLastNodeInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = ListUtils.generateSingleLinkedList(new int[]{1,2,3,4,5});
		ListUtils.printSingleLinkedList(nthToLast(head, 4));
	}

    public static ListNode nthToLast(ListNode head, int n) {
        // write your code here
    	if (head == null || n < 1) {
    		return null;
    	}
    	ListNode p1 = head;
    	ListNode p2 = head;
    	
    	for (int i = 0; i < n - 1; i++) {
    		if (p2 == null) {
    			return null;
    		}
    		p2 = p2.next;
    	}
    	
    	while (p2.next != null) {
    		p2 = p2.next;
    		p1 = p1.next;
    	}
    	
    	return p1;
    }
}
