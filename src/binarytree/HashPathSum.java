package binarytree;

/**
 * @Author: gws
 * @Date: 22/04/2018 00:21
 * @Description:
 */
public class HashPathSum {
    public static void main(String[] args) {

    }

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;

        int val = root.val;
        if (root.left == null && root.right == null && val == sum) return true;

        boolean left = hasPathSum(root.left, sum - val);
        boolean right = hasPathSum(root.right, sum - val);

        return left || right;
    }
}
