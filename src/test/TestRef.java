package test;

import list.ListNode;

import java.util.List;

/**
 * @Author: gws
 * @Date: 17/04/2018 19:44
 * @Description:
 */
public class TestRef {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        n1.next = n2;

        d(n1);

        System.out.println(n1.val);

    }
    public static void d(ListNode node){
        node = node.next;
    }
}
