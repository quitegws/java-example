package list;

import java.util.List;

public class ListUtils {

	public static ListNode generateSingleLinkedList(int[] data){
		if (data.length == 0) {
			return null;
		}
		ListNode head = new ListNode(0);
//		ListNode point = new ListNode(0);
		ListNode point = head;
		for (int i = 0; i < data.length; i++) {
			ListNode next = new ListNode(data[i]);
			point.next = next;
			point = next;
		}
		
		return head.next;
	}
	
	public static  void printSingleLinkedList(ListNode head){
		if (head == null) {
			print("null");
		}
		
		while (head != null) {
			int val = head.val;
			head = head.next;
			if (head == null)
				print(val + "->null");
			else
				print(val + "->");
			
		}
		
	}
	
	public static void print(String s){
		System.out.print(s);
	}
	
}
