package binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class IsSymmetrical {
    boolean isSymmetrical(TreeNode pRoot)
    {
        TreeNode node = getMirror(pRoot);
        return isSymmetrical(pRoot,node);
    }
    boolean isSymmetrical(TreeNode pRoot,TreeNode node)
    {
        if(pRoot == null && node == null){
            return true;
        }else if(pRoot == null || node  == null){
            return false;
        }
        if(pRoot.val == node.val){
            return isSymmetrical(pRoot.left,node.left)&&isSymmetrical(pRoot.right,node.right);
        }
        return false;
    }

    TreeNode getMirror(TreeNode pRoot){
        if (pRoot == null) {
            return null;
        }
        TreeNode root = new TreeNode(pRoot.val);
        root.right = getMirror(pRoot.left);
        root.left = getMirror(pRoot.right);
        return root;
    }

    boolean isSymmetrical1(TreeNode root){
        if (root == null) {
            return true;
        }
        Queue<TreeNode> p = new LinkedList<>();
        Queue<TreeNode> q = new LinkedList<>();

        p.offer(root.left);
        q.offer(root.right);

        TreeNode left = null;
        TreeNode right = null;

        while(!q.isEmpty() && !q.isEmpty()){
            left = p.poll();
            right = q.poll();

            if (left == null && right == null) {
                continue;
            }
            if (left == null || right == null) {
                return false;
            }
            if (left.val != right.val) {
                return false;
            }
            p.offer(left.left);
            p.offer(left.right);
            q.offer(right.right);
            q.offer(right.left);
        }

        return true;
    }

}