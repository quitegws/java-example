package binarytree;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: gws
 * @Date: 04/05/2018 16:34
 * @Description:
 */
public class LargestValues {
    public static void main(String[] args) {

    }
    public List<Integer> largestValues(TreeNode root) {
        List<TreeNode> list = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        list.add(root);
        while (list.size() != 0) {
            list.sort((TreeNode node1, TreeNode node2) -> {
                 if (node2.val > node1.val) return 1;
                 else if (node1.val == node2.val) return 0;
                 else return -1;
            });
            List<TreeNode> tmp = new ArrayList<>();

            res.add(list.get(0).val);
            for (TreeNode node : list) {
                if (node.left != null) tmp.add(node.left);
                if (node.right != null) tmp.add(node.right);
            }
            list.clear();
            list.addAll(tmp);
        }
        return res;
    }
}
