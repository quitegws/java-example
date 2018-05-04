package binarytree;


public class IsSubtree {
  /**
   * @param T1, T2: The roots of binary tree.
   * @return: True if T2 is a subtree of T1, or false.
   */
  public boolean isSubtree(TreeNode T1, TreeNode T2) {
      // write your code here
	  if (T1 == null) {
		  return T2 == null;
	  }
	  if (T2 == null) {
		  return T1 == null;
	  }
	  if (isEqual(T1, T2)) {
		  return true;
	  }
	  
	  return isSubtree(T1.left, T2) || isSubtree(T1.right, T2);
	  
  }
  
  public boolean isEqual(TreeNode t1, TreeNode t2){
	  
	  if (t1 == null || t2 == null) {
		  return t1 == t2;
	  }
	  if (t1.val != t2.val) {
		  return false;
	  }
	  return isEqual(t1.left, t2.left) && isEqual(t1.right, t2.right);
  }
  
  public static void main(String[] args){
	  TreeNode root = Utils.newTreeFromArray(new int[]{1,2,3,4,5});
	  TreeNode root2 = Utils.newTreeFromArray(new int[]{2,4});
	  Utils.printTreePretty(root);
	  Utils.printTreePretty(root2);
	  System.out.println(new IsSubtree().isSubtree(root, root2));
	  
  }
  
}
