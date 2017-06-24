package binarytree;

public class TreeNode<T> {
	  
    public T val;
    public TreeNode<T> left, right;
    public TreeNode(T val) {
        this.val = val;
        this.left = this.right = null;
    }
}