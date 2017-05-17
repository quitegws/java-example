package list;

public class MergeTwoSortedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode h1 = new ListNode(1);
		h1.val = 2;
		ListNode h12 = h1.next = new ListNode(1);
		
		ListNode h13 = h12.next = new ListNode(5);
		ListNode h14 = h13.next;
		
		ListNode h2 = new ListNode(5);
		ListNode h22 = h2.next = new ListNode(9);
		ListNode h23 = h22.next = new ListNode(2);
		ListNode h24 = h23.next;
		ListUtils.printSingleLinkedList(mergeTwoLists(h1, h2));
	}

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // write your code here
    	if (l1 == null) {
    		return l2;
    	}
    	if (l2 == null) {
    		return l1;
    	}
    	
    	ListNode head = new ListNode(0);
    	ListNode point = new ListNode(0);
    	head = point;
    	while (l1 != null && l2 != null) {
    		int i1 = l1.val;
    		int i2 = l2.val;
    		ListNode next;
    		if (i1 < i2) {
    			next = new ListNode(i1);
    			point.next = next;
    			point = next;
    			l1 = l1.next;
    		} else {
    			next = new ListNode(i2);
    			point.next = next;
    			point = next;
    			l2 = l2.next;
    		}
    	}
    	
    	while (l1 != null) {
    		ListNode next = new ListNode(l1.val);
    		point.next = next;
    		point = next;
    		l1 = l1.next;
    	}
    	
    	while (l2 != null) {
    		ListNode next = new ListNode(l2.val);
    		point.next = next;
    		point = next;
    		l2 = l2.next;
    	}
    	
    	return head.next;
    }
}
