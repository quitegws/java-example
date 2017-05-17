package list;

public class InsertionSortList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] data = new int[]{1,4,3,2,5,2};
		ListNode node = ListUtils.generateSingleLinkedList(data);
		ListUtils.printSingleLinkedList(node);
		System.out.println();
	}

    public ListNode insertionSortList(ListNode head) {
        // write your code here
    }
}
