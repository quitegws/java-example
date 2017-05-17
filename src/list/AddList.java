package list;

public class AddList {
	public static void main(String[] args){
		ListNode p1 = ListUtils.generateSingleLinkedList(new int[]{2,8,2,8,2,9,6,4,5,2,5,2});
		ListNode p2 = ListUtils.generateSingleLinkedList(new int[]{5,8,9,5,6,5,1,8,7,5,5});
		ListUtils.printSingleLinkedList(p1);
		ListUtils.printSingleLinkedList(p2);
		
		ListUtils.printSingleLinkedList(addLists(p1,p2));
	}

    public static ListNode addLists2(ListNode l1, ListNode l2) {
        // write your code here
    	if (l1 == null)
    		return l2;
    	if (l2 == null)
    		return l1;
    	
    	long i1 = 0;
    	long i2 = 0;
    	int i = 0;
    	ListNode result = new ListNode(0);
    	ListNode point = result;
    	l1 = ReverseLinkedLIst.reverse(l1);
    	l2 = ReverseLinkedLIst.reverse(l2);
    	while (l1 != null) {
    		int val = l1.val;
    		i1 += val * (Math.pow(10.0, i));
    		i++;
    		l1 = l1.next;
    	}
    	System.out.println(i1);
    	i = 0;
    	while (l2 != null) {
    		int val = l2.val;
    		i2 += val * (Math.pow(10.0, i));
    		i++;
    		l2 = l2.next;
    	}
    	System.out.println(i2);
    	long sum = i1 + i2;
    	System.out.println(sum);
    	if (sum == 0) {
    		return result;
    	}
    	
    	while (sum != 0) {
    		long val = sum % 10;
    		ListNode node = new ListNode((int)val);
    		point.next = node;
    		point = point.next;
    		sum = sum / 10;
    	}
    	return ReverseLinkedLIst.reverse(result.next);
    }  

    public static ListNode addLists(ListNode l1, ListNode l2){
        // write your code here
    	if (l1 == null)
    		return l2;
    	if (l2 == null)
    		return l1;
    	
    	StringBuilder sb1 = new StringBuilder();
    	StringBuilder sb2 = new StringBuilder();
    	StringBuilder sb3 = new StringBuilder();
    	ListNode result = new ListNode(0);
    	ListNode point = result;
    	while (l1 != null) {
    		char c = (char)l1.val;
    		sb1.append(c);
    		l1 = l1.next;
    	}
    	while (l2 != null) {
    		char c = (char)l2.val;
    		sb2.append(c);
    		l2 = l2.next;
    	}
    	
    	sb1 = sb1.reverse();
    	sb2 = sb2.reverse();
    	int len1 = sb1.length();
    	int len2 = sb2.length();
    	int carry = 0;
    	
    	for (int i = 0; i < Math.min(len1, len2); i++) {
    		int i1 = sb1.charAt(i);
    		int i2 = sb2.charAt(i);
    		
    		int tmp = i1 + i2 + carry;
    		carry = tmp / 10;
    		int i3 = tmp % 10;
    		sb3.append(i3);
    	}
    	
    	if (len1 < len2) {
    		for (int i = len1; i < len2; i++) {
        		int i2 = sb2.charAt(i);
        		int tmp = i2 + carry;
        		carry = tmp / 10;
        		int i3 = tmp % 10;
        		sb3.append(i3);
    		}
    	} else {
        	for (int i = len2; i < len1; i++) {
        		int i1 = sb1.charAt(i);
        		
        		int tmp = i1 + carry;
        		carry = tmp / 10;
        		int i3 = tmp % 10;
        		sb3.append(i3);
        	}
    	}
    	if (carry != 0) {
    		sb3.append(carry);
    	}
    	
    	for (int i = sb3.length() - 1; i >=0 ; i--) {
    		int i1 = sb3.charAt(i) - '0';
    		ListNode node = new ListNode(i1);
    		point.next = node;
    		point = point.next;
    	}
    	
    	return result.next;
    }

}
