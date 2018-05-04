package binarytree;

import java.util.List;

/**
 * @Author: gws
 * @Date: 22/04/2018 00:25
 * @Description: leetcode no.437
 */
public class PathSum2 {
    public static void main(String[] args) {
        PathSum2 pathSum2 = new PathSum2();
        System.out.println("    ");
    }

    public int pathSum(TreeNode root, int sum) {
        if (root == null) return 0;
        int ret= pathSumStartsWithRoot(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
        return ret;
    }
    public int pathSumStartsWithRoot(TreeNode root, int sum){
        if (root == null) return 0;
        int ret = 0;
        if (root.val == sum) ret++;
        ret += pathSumStartsWithRoot(root.left, sum - root.val) + pathSumStartsWithRoot(root.right, sum - root.val);
        return ret;
    }
}
