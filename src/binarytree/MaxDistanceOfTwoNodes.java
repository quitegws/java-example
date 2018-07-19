package binarytree;

/**
 * @Author: gws
 * @Date: 21/04/2018 15:46
 * @Description:
 */
public class MaxDistanceOfTwoNodes {

    public int max = 0;
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5,6};
        MaxDistanceOfTwoNodes maxDistanceOfTwoNodes = new MaxDistanceOfTwoNodes();
        TreeNode root = Utils.newTreeFromArray(a);
        Utils.printTreePretty(root);
        System.out.println(maxDistanceOfTwoNodes.maxDistance(root));
        System.out.println(maxDistanceOfTwoNodes.depth(root));
    }

    public int maxDistance(TreeNode root){
        if (root == null) return 0;
        if (root.left == null && root.left == null) return 0;

        if (root.left == null) return depth(root.right) ;
        if (root.right == null) return depth(root.left);

        return depth(root.right) + depth(root.left);

    }

    public int depth(TreeNode node){
        if (node == null) {
            return 0;
        }
        return 1 + Math.max(depth(node.left), depth(node.right));
    }
}
