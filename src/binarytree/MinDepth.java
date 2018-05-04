package binarytree;

/**
 * @Author: gws
 * @Date: 04/05/2018 16:23
 * @Description:
 */
public class MinDepth {
    public static void main(String[] args) {
        MinDepth minDepth = new MinDepth();
        System.out.println(minDepth.minDepth(Utils.newTreeFromArray(new int[]{1,2,3,4,5,6,7,8})));
    }
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        int left = 0;
        int right = 0;
        if (root.left != null) {
            left = minDepth(root.left);
        }
        if (root.right != null) {
            right = minDepth(root.right);
        }

        if (left == 0) return 1 + right;
        if (right == 0) return 1 + left;
        return Math.min(left,right) + 1;
    }
}
