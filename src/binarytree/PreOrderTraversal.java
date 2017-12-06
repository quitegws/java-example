package binarytree;

import java.util.ArrayList;
import java.util.Stack;

public class PreOrderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    ArrayList<Integer> result = new ArrayList<>();
    /**
     * Recursion Version
     * @param root: The root of binary tree.
     * @return: Preorder in ArrayList which contains node values.
     */
    public ArrayList<Integer> preorderTraversal0(TreeNode root) {
        // write your code here
        if (root != null) {
            result.add((Integer)root.val);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
        return result;
    }
    
    //Non-Recursion
    /** 
     *  
     * @param root 树根节点 
     * 利用栈实现循环先序遍历二叉树 
     * 这种实现类似于图的深度优先遍历（DFS） 
     * 维护一个栈，将根节点入栈，然后只要栈不为空，出栈并访问，接着依次将访问节点的右节点、左节点入栈。 
     * 这种方式应该是对先序遍历的一种特殊实现（看上去简单明了），但是不具备很好的扩展性，在中序和后序方式中不适用 
     */ 
    public ArrayList<Integer> preorderTraversal(TreeNode root){
    	Stack<TreeNode> stack = new Stack<>();
    	ArrayList<Integer> result = new ArrayList<>();
    	
    	if (root != null) {
    		stack.push(root);
    		
    		while (!stack.empty()) {
    			TreeNode node = stack.pop();
    			result.add((Integer)node.val);
    			if (node.right != null) {
    				stack.push(node.right);
    			}
    			if (node.left != null) {
    				stack.push(node.left);
    			}
    		}
    	}
    	return result;
    	
    }
    /** 
     *  
     * @param root 树的根节点 
     * 利用栈模拟递归过程实现循环先序遍历二叉树 
     * 这种方式具备扩展性，它模拟递归的过程，将左子树点不断的压入栈，直到null，然后处理栈顶节点的右子树 
     */
    public ArrayList preOrderStack_2(TreeNode root){  
    	ArrayList<Integer> result = new ArrayList<>();
    	if(root==null)
    		return result;  
        Stack<TreeNode> s = new Stack<TreeNode>();  
        while(root != null || !s.isEmpty()){  
            while(root != null){  
                System.out.println(root.val);  
                result.add((Integer)root.val);
                s.push(root);//先访问再入栈  
                root = root.left;  
            }  
            root = s.pop();  
            root = root.right;//如果是null，出栈并处理右子树  
        }  
        return result;
    } 

}
