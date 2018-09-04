package binarytree;

/**
 * @Author: gws
 * @Date: 31/08/2018 01:38
 * @Description:输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 */
public class HasSubtree {

    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root1 == null || root2 == null) return  false;
        return doesTree1HasTree2(root1, root2);
    }

    public boolean doesTree1HasTree2(TreeNode node1, TreeNode node2) {
        if (node2 == null) {
            return true;
        }
        if(node1 == null) {
            return false;
        }
        if(node1.val == node2.val) {
            boolean left  = doesTree1HasTree2(node1.left, node2.left);
            boolean right = doesTree1HasTree2(node1.right, node2.right);
            if ( right && left){
                return true;
            }
        }
        return doesTree1HasTree2(node1.left, node2) || doesTree1HasTree2(node1.right, node2);

    }

    public boolean isEqual(TreeNode node, TreeNode root) {
        if(node == null && root == null) return true;
        if(node == null && root != null) return false;
        if(node != null && root == null) return false;
        if(root.val == node.val) return isEqual(node.left, root.left) && isEqual(node.right, root.right);
        return false;
    }

    public static void main(String[] args) {
        TreeNode root = Utils.newTreeFromArray(new int[]{8,9,2});
        TreeNode node = Utils.newTreeFromArray(new String[]{"8","8","7","9","2","#","#","#","#","4","7"});
        HasSubtree hasSubtree = new HasSubtree();

        Utils.printTreePretty(root);
        Utils.printTreePretty(node);
        System.out.println(hasSubtree.doesTree1HasTree2(node,root));
        System.out.println("");
    }
}
