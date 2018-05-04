package binarytree;

import java.util.LinkedList;

/**
 * @Author: gws
 * @Date: 21/04/2018 22:52
 * @Description:
 */
public class AddOneRow {
    public static void main(String[] args) {
        int i = 1;
        System.out.println(--i >= 0);
    }


    public TreeNode addOneRow(TreeNode root, int v, int d) {

        if (d == 0 || d == 1) {
            TreeNode node = new TreeNode(v);
            if (d == 1) {
                node.left = root;
            } else {
                node.right = root;
            }

            return node;
        }

        if (root != null && d > 1) {
            root.left = addOneRow(root.left, v, d > 2 ? d - 1 : 1);
            root.right = addOneRow(root.right,v,d > 2 ? d - 1 : 0);
        }

        return root;
    }

}
