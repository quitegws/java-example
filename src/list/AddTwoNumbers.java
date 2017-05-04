package list;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;      
 *     }
 * }
 */
import list.ListNode;

public class AddTwoNumbers {
	
	public static void main(String[] args){
		
		ListNode h1 = new ListNode(3);
		ListNode h12 = h1.next = new ListNode(1);
		ListNode h13 = h12.next = new ListNode(5);
		ListNode h14 = h13.next;
		
		ListNode h2 = new ListNode(5);
		ListNode h22 = h2.next = new ListNode(9);
		ListNode h23 = h22.next = new ListNode(2);
		ListNode h24 = h23.next;
		
		addLists2(h1, h2);
	}
    /**
     * @param l1: the first list
     * @param l2: the second list
     * @return: the sum list of l1 and l2 
     */
    public static ListNode addLists(ListNode l1, ListNode l2) {
        // write your code here
    	StringBuilder sb = new StringBuilder();
    	int num1 = 0;
    	int num2 = 0;
    	
    	do {
    		sb.append(l1.val);
    	}while (l1.next != null);
    	
    	sb = sb.reverse();
    	num1 = Integer.valueOf(sb.toString());
    	
    	do {
    		sb.append(l1.val);
    		
    	}while (l2.next != null);
    	
    	sb = sb.reverse();
    	num2 = Integer.valueOf(sb.toString());
    	String sum = String.valueOf(num1 + num2);
    	
    	sb = new StringBuilder(sum);
    	sum = sb.reverse().toString();
    	
    	
    	ListNode head = new ListNode((int)sum.charAt(0));
    	ListNode tmp = head;
    	for (int i = 0; i < sum.length(); i++) {
    		tmp.val = (int) sum.charAt(i);
    		if (i < sum.length() - 1) {
    			tmp.next = new ListNode((int)sum.charAt(i + 1));
    		}
    		tmp = tmp.next;
    	}
    	return head;
    	
    }

    
    public static ListNode addLists2(ListNode l1, ListNode l2){
    	if (l1 == null || l2 == null) {
    		return null;
    	}
    	
    	ListNode head = new ListNode(0);
    	ListNode point = head;
    	
    	int carry = 0;
    	
    	while (l1 != null && l2 != null) {
    		int sum = carry + l1.val + l2.val;
    		point.next = new ListNode(sum % 10);
    		
    		carry = sum / 10;
    		
    		l1 = l1.next;
    		l2 = l2.next;
    		point = point.next;
    		
    	}
    	
    	while (l1 != null) {
    		int sum = carry + l1.val;
    		point.next = new ListNode(sum % 10);
    		carry = sum / 10;
    		l1 = l1.next;
    		point = point.next;
    	}
    	
    	while (l2 != null) {
    		int sum = carry + l2.val;
    		point.next = new ListNode(sum % 10);
    		carry = sum / 10;
    		l2 = l2.next;
    		point = point.next;
    	}
    	
    	if (carry != 0) {
    		point.next = new ListNode(carry);
    		
    	}
    	
    	return head.next;
    }

}
