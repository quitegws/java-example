package binarytree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author: gws
 * @Date: 04/05/2018 12:13
 * @Description:
 */
public class MaxDepth {
    public static void main(String[] args) {
        MaxDepth maxDepth = new MaxDepth();
        System.out.println(maxDepth.maxDepth(Utils.newTreeFromArray(new int[]{1,2,3,4})));
    }

    public int maxDepth(TreeNode root){
        dfs(root, 0);
        return max;
    }
    int max = 0;
    public void dfs(TreeNode root, int depth){
        if (root == null) {
            return ;
        }
        max = Math.max(depth + 1, max);
        dfs(root.left, depth + 1);
        dfs(root.right, depth + 1);

    }
    public int maxDepth2(TreeNode root) {
        if (root == null) return 0;
        int res = 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            ++res;
            int n = q.size();
            for (int i = 0; i < n; ++i) {
                TreeNode t = q.poll();
                if (t.left != null) q.offer(t.left);
                if (t.right != null) q.offer(t.right);
            }
        }
        return res;
    }
}
