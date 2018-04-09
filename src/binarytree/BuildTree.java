package binarytree;

/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */

public class BuildTree {
    /**
     * @param inorder: A list of integers that inorder traversal of a tree
     * @param preorder: A list of integers that postorder traversal of a tree
     * @return: Root of a tree
     */
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        if (inorder == null || preorder == null) {
            return null;
        }
        if (inorder.length != preorder.length) {
            return null;
        }
        return doBuild(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1);

    }

    public TreeNode doBuild(int[] preorder, int[] inorder, int pre1, int pre2, int in1, int in2){
        // write your code here
        if (inorder == null || preorder == null) {
            return null;
        }
        if(pre1 > pre2 || in2 < in1 || pre2 - pre1 != in2 - in1){
            return null;
        }

        if (pre2 > preorder.length || in2 > inorder.length) {
            return null;
        }
        if (pre1 < 0 || in1 < 0) {
            return null;
        }
        if (inorder.length != preorder.length) {
            return null;
        }

        int root = preorder[pre1];
        int i;
        for (i = in1; i < inorder.length; i++){
            if(preorder[i] == inorder[i]){
                break;
            }
        }

        TreeNode rootNode = new TreeNode(root);

        rootNode.left = doBuild(preorder, inorder, pre1 + 1, pre1 + i - in1, in1, i - 1);
        rootNode.right = doBuild(preorder, inorder, pre1 + i - in1 +1, pre2, i + 1, in2);

        return rootNode;
    }
}