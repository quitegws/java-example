package binarytree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author: gws
 * @Date: 21/04/2018 22:12
 * @Description:
 */
public class WidthOfBinaryTree {
    public static void main(String[] args) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(null);
        queue.offer(null);
        System.out.println(queue.size());

        TreeNode root = Utils.newTreeFromArray(new int[]{1,1,1});
        System.out.println(new WidthOfBinaryTree().widthOfBinaryTree(root));
        Utils.printTreePretty(root);
    }
    public  int widthOfBinaryTree(TreeNode root){
        if (root == null) return 0;
        int max = 1;
        LinkedList<Pair> queue = new LinkedList<>();
        Pair first = new Pair(root, 0);
        queue.offer(first);

        while (!queue.isEmpty()) {
            int len = queue.size();
            int begin = queue.peek().index;
            int end = queue.get(len - 1).index;

            for (int i = 0; i < len; i++) {
                Pair p = queue.poll();
                TreeNode node = p.node;
                int index = p.index;
                if (node.left != null) {
                    queue.offer(new Pair(node.left, index * 2));
                }
                if (node.right != null) {
                    queue.offer(new Pair(node.right, index * 2 + 1));
                }
            }
            max = Math.max(max, end - begin + 1);
        }

        return max;
    }

    class Pair{
        public TreeNode node ;
        public int index ;
        public Pair(TreeNode node, int index){
            this.index = index;
            this.node = node;
        }
    }
}
