package binarytree;

/**
 * @Author: gws
 * @Date: 20/05/2018 15:29
 * @Description:
 */
public class Connect {

    public void connect(TreeLinkNode root) {

        //head of the next level
        TreeLinkNode head = null;
        //the leading node on the next level
        TreeLinkNode prev = null;
        //current node of current level
        TreeLinkNode curr = root;

        while (curr != null) {
            //iterate on the current level
            while (curr != null) {
                //left child
                if (curr.left != null) {
                    if (prev != null) {
                        prev.next = curr.left;
                    } else {
                        head = curr.left;
                    }
                    prev = curr.left;
                }
                //right child
                if (curr.right != null) {
                    if (prev != null) {
                        prev.next = curr.right;
                    } else {
                        head = curr.right;
                    }
                    prev = curr.right;
                }
                //move to next node
                curr = curr.next;
            }
            //move to next level
            curr = head;
            head = null;
            prev = null;
        }
    }
}

