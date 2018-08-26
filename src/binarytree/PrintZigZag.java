package binarytree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

/**
 * @Author: gws
 * @Date: 25/08/2018 22:45
 * @Description:
 */
public class PrintZigZag {
    public static void main(String[] args) {
        TreeNode treeNode = Utils.newTreeFromArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        Utils.printTreePretty(treeNode);

        ArrayList<ArrayList<Integer>> print = new PrintZigZag().Print(treeNode);

        for(ArrayList<Integer> list : print) {
            for(Integer i : list){
                System.out.print(i + " -- ");
            }
            System.out.println("");
        }
    }

    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        if (pRoot == null) return res;

        LinkedList<TreeNode> stack = new LinkedList<>();
        stack.offer(pRoot);
        boolean direction = true;
        ArrayList<Integer> line = new ArrayList<>();

        while (!stack.isEmpty()) {
            int cnt = stack.size();
            for (int i = 0; i < cnt; i++) {
                TreeNode pop = stack.poll();
                if (pop.left != null) {
                    stack.offer(pop.left);
                }
                if (pop.right != null) {
                    stack.offer(pop.right);
                }
                line.add(pop.val);
            }
            if (direction == false) {
                Collections.reverse(line);
            }
            res.add(new ArrayList<>(line));
            line.clear();
            direction = !direction;
        }

        return res;
    }
}
