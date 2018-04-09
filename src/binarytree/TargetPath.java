package binarytree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

/**
 public class TreeNode {
 int val = 0;
 TreeNode left = null;
 TreeNode right = null;

 public TreeNode(int val) {
 this.val = val;

 }

 }输入一颗二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 */
public class TargetPath {
    public  ArrayList<ArrayList<Integer>> result = new  ArrayList<ArrayList<Integer>>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        if (root == null) {
            return new  ArrayList<ArrayList<Integer>>();
        }
        LinkedList<Integer> stack = new LinkedList<>();
        int currentSum = 0;
        helper(root, stack, target,currentSum);

        return result;
    }

    public  void helper(TreeNode root, LinkedList<Integer> stack, int target, int currentSum){
        if (root == null) {
            return;
        }

        currentSum += root.val;
        stack.push(root.val);
        boolean isLeaf = root.left == null && root.right == null;

        if (target == currentSum && isLeaf) {
            ArrayList<Integer> l = new ArrayList<>(stack);
            Collections.reverse(l);
            result.add(l);
        }

        if (root.left != null) {
            helper(root.left, stack, target, currentSum);
        }
        if (root.right != null) {
            helper(root.right, stack, target, currentSum);
        }
        stack.pop();
    }
}