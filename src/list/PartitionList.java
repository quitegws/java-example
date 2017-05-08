package list;

public class PartitionList {

	public static void main(String[] args){
		int[] data = new int[]{1,4,3,2,5,2};
		ListNode node = ListUtils.generateSingleLinkedList(data);
		ListUtils.printSingleLinkedList(node);
		System.out.println();
		ListUtils.printSingleLinkedList(partition(node, 3));
	}
    public static  ListNode partition(ListNode head, int x) {
        // write your code here
    	if (head == null) {
    		return null;
    	}
    	ListNode point = head;
    	ListNode left = new ListNode(0);
    	ListNode leftTmp = left;
    	ListNode right = new ListNode(0);
    	ListNode rightTmp = right;
    	
    	while (point != null) {
    		int val = point.val;
    		if (val < x) {
    			ListNode next = new ListNode(val);
    			left.next = next;
    			left = left.next;
    		} else {
    			ListNode next = new ListNode(val);
    			right.next = next;
    			right = right.next;
    		}
    		point = point.next;
    	}
    	left.next = rightTmp.next;
    	
    	return leftTmp.next;
    }


    public static ListNode partition2(ListNode head, int x){
    	if (head == null) {
    		return null;
    		
    	}
    	
    	ListNode pointer1 = head;
    	ListNode pointer2 = head;
    	ListNode point = head;
    	
    	while (point != null) {
    		int val = point.val;
    		if (val < x) {
    			
    		}
    	}
    	return null;
    }
}
