package visualtool.tree;

import java.awt.Graphics;

import binarytree.TreeNode;

public class Utils {
	public static void printTree(TreeNode root) {  
	    MyWindow jf = new MyWindow();  
	    jf.setSize(800, 800);  
	    jf.setVisible(true);  
	    jf.setDefaultCloseOperation(3);  
	    drawTree(root, jf, 300, 150, 1);  
	}  
	  
	// 画哈夫曼树  
	public static void drawTree(TreeNode a, MyWindow jf, int x, int y, int level) {  
	    Graphics g = jf.getGraphics();  
	    level++;  
	    if (a.left == null && a.right == null) {  
	        g.drawString("" + a.val, x, y);  
	        jf.getShapes().add(new Word((int)a.val, x, y));  
	        System.out.println("画完节点" + a.val);  
	    }  
	    if (a.left != null) {  
	        g.drawLine(x, y, x - 150/level, y + 10*level);  
	        jf.getShapes().add(new Line(x, y, x - 150/level, y + 10*level));  
	        drawTree(a.left, jf, x - 150/level, y + 10*level, level);  
	    }  
	    if (a.right != null) {  
	        g.drawLine(x, y, x + 150/level, y + 10*level);  
	        jf.getShapes().add(new Line(x, y, x + 150/level, y + 10*level));  
	        drawTree(a.right, jf, x + 150/level, y + 10*level, level);  
	    }  
	} 
}
