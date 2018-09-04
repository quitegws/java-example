package binarytree;

import java.util.Stack;

/**
 * @Author: gws
 * @Date: 30/08/2018 17:14
 * @Description:
 */
public class KthNodeOfBST {

    int index = 0; //计数器
    TreeNode KthNode(TreeNode root, int k)
    {
        if(root != null){ //中序遍历寻找第k个
            TreeNode node = KthNode(root.left,k);
            if(node != null)
                return node;
            index ++;
            if(index == k)
                return root;
            node = KthNode(root.right,k);
            if(node != null)
                return node;
        }
        return null;
    }


    //非递归中序遍历
    public TreeNode kthNode(TreeNode root, int k) {
        if (root == null || k <= 0) {
            return null;
        }

        Stack<TreeNode> stack = new Stack<>();

        TreeNode p = root;
        int index = 0;
        while (p != null || !stack.isEmpty()) {
            while(p != null) {
                stack.push(p);
                p = p.left;
            }
            p = stack.pop();
            index++;
            if (index == k)  return  p;

            p = p.right;

        }

        return null;
    }


}
