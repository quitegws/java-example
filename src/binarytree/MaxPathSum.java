package binarytree;

/**
 * @Author: gws
 * @Date: 22/04/2018 22:18
 * @Description: leetcode no.124
 */
public class MaxPathSum {

    public static void main(String[] args) {
        MaxPathSum maxPathSum = new MaxPathSum();
        TreeNode root = Utils.newTreeFromArray(new int[]{1,1,2,3,-4,3,0,4,5});
        System.out.println(maxPathSum.maxPathSum(root));
        Utils.printTreePretty(root);

    }

    public int maxPathSum(TreeNode root){
        maxSingle(root);
        return max;
    }
    public int max = Integer.MIN_VALUE;
    public int maxSingle(TreeNode root){
        if (root == null) return 0;

        int left = maxSingle(root.left);
        int right = maxSingle(root.right);

        max = Math.max(max, Math.max(0, left) + Math.max(0, right) + root.val);

        return Math.max(0, Math.max(left, right)) + root.val;
    }
}
