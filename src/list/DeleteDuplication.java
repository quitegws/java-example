package list;


/**
 * @Author: gws
 * @Date: 25/08/2018 13:08
 * @Description:
 */
public class DeleteDuplication {

    public static void main(String[] args) {
        ListNode head = ListUtils.generateSingleLinkedList(new int[]{1,2,3,3,4,4,5});
        ListUtils.printSingleLinkedList(head);

        DeleteDuplication deleteDuplication  = new DeleteDuplication();

        ListNode listNode = deleteDuplication.deleteDuplication1(head);
        ListUtils.printSingleLinkedList(listNode);
    }


    public ListNode deleteDuplication1(ListNode pHead) {
        if (pHead == null || pHead.next == null) return pHead;

        ListNode h = new ListNode(0);
        h.next = pHead;

        ListNode p = h;

        while (pHead != null){
            if (pHead.next != null && pHead.val == pHead.next.val) {
                while(pHead.next != null && pHead.val == pHead.next.val) {
                    pHead = pHead.next;
                }
                pHead = pHead.next;
                p.next = pHead;
            } else {
                p = p.next;
                pHead = pHead.next;
            }
        }

        return  h.next;
    }

    public ListNode deleteDuplication2(ListNode pHead)
    {
        ListNode result;
        ListNode temp=pHead;
        ListNode index=new ListNode(1);
        index.next=pHead;
        result=index;
        while(temp!=null){
            if(temp.next!=null&&temp.next.val==temp.val){
                while(temp.next!=null&&temp.next.val==temp.val){
                    temp=temp.next;
                }
                temp=temp.next;
                index.next=temp;
            }
            else{
                index=index.next;
                temp=temp.next;
            }
        }
        return result.next;
    }

    public ListNode deleteDuplication(ListNode pHead){
        if (pHead == null || pHead.next == null) return pHead;

        if (pHead.val == pHead.next.val) {
            ListNode node = pHead.next;

            while(node != null && node.val == pHead.val) {
                node = node.next;
            }

            return deleteDuplication(node);

        } else {
            pHead.next = deleteDuplication(pHead.next);
            return pHead;
        }

    }



}
