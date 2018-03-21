package binarytree;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */

public class BstSwappedNode {

    public List<TreeNode> nodes = new ArrayList<>();
    /**
     * @param root: the given tree
     * @return: the tree after swapping
     */
    public TreeNode bstSwappedNode(TreeNode root) {
        // write your code here
        TreeNode p = root;
        helper(root);

        if (nodes.size() == 2) {
            TreeNode node1 = nodes.get(0);
            TreeNode node2 = nodes.get(1);

            int tmp = node1.val;
            node1.val = node2.val;
            node2.val = tmp;

        }
        return p;

    }

    public TreeNode helper(TreeNode root){

        if (root == null) {
            return root;
        }

        if (root.left == null && root.right == null) {
            return root;
        }

        if (root.right != null && root.right.val < root.val) {
            boolean flag = false;
            for (TreeNode node : nodes) {
                if (node.val == root.val) {
                    flag = true;
                }
            }
            if (!flag)
            nodes.add(root.right);
        }
        if (root.left != null && root.left.val > root.val) {
            boolean flag = false;
            for (TreeNode node : nodes) {
                if (node.val == root.val) {
                    flag = true;
                }
            }
            if (!flag)
            nodes.add(root.left);
        }
        helper(root.right);
        helper(root.left);

        return root;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(4);
        TreeNode node3 = new TreeNode(1);
        TreeNode node4 = new TreeNode(3);

        root.left = node1;
        root.right = node2;

//        node1.left = node3;
//        node1.right = node4;


        Utils.printTreePretty(root);
        TreeNode res = new BstSwappedNode().bstSwappedNode(root);

        Utils.printTreePretty(res);
        Utils.printTreePretty(root);


    }

}