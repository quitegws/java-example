package list;

/**
 * @Author: gws
 * @Date: 24/03/2018 14:53
 * @Description:
 */
public class MergeLinkedList {
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode root = new ListNode(0);
        ListNode p = root;
        while(list1 != null && list2 != null) {
            if (list1.val > list2.val) {
                ListNode node  = new ListNode(list2.val);
                p.next = node;
                p = p.next;
                list2 = list2.next;
            } else {
                ListNode node  = new ListNode(list1.val);
                p.next = node;
                p = p.next;
                list1 = list1.next;
            }

        }
        while(list1 != null){
            ListNode node  = new ListNode(list1.val);
            p.next = node;
            p = p.next;
            list1 = list1.next;
        }
        while(list2 != null){
            ListNode node  = new ListNode(list2.val);
            p.next = node;
            p = p.next;
            list2 = list2.next;
        }
        return root.next;
    }
}
