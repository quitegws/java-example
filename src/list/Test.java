package list;

/**
 * @Author: gws
 * @Date: 27/08/2018 00:47
 * @Description:
 */

public class Test {

    private static ListNode p1 = new ListNode(1);
    private static  ListNode p2 = new ListNode(2);
    ListNode p3 = new ListNode(3);
    ListNode p4 = new ListNode(4);
    ListNode p5 = new ListNode(5);
    ListNode p6 = new ListNode(6);

    public static void main(String[] args) {
        p1.next = p2;
    }


}