package binarytree;

/**
 * @Author: gws
 * @Date: 04/05/2018 12:08
 * @Description:
 */
public class SortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) return null;
        return toBST(nums, 0, nums.length - 1);

    }
    public TreeNode toBST(int[] nums, int low, int high){
        if (nums == null || nums.length == 0) return null;
        if (low > high) return null;
        int mid = (low + high) / 2;

        TreeNode root = new TreeNode(nums[mid]);
        root.left = toBST(nums, low, mid - 1);
        root.right = toBST(nums, mid + 1, high);
        return root;
    }
    public static void main(String[] args) {
        int[] a = {-10,-3,0,5,9};
        SortedArrayToBST sortedArrayToBST = new SortedArrayToBST();
        System.out.println(sortedArrayToBST.sortedArrayToBST(a));
    }
}
