package visualtool.tree;

import java.awt.Graphics;  
/** 
 * 在界面上画一个字符 
 * @author Micro 
 * 
 */  
public class Word extends Shape {  
    int c;  
    int x;  
    int y;  
  
    public Word(int c, int x, int y) {  
        this.c = c;  
        this.x = x;  
        this.y = y;  
    }  
  
    @Override  
    public void draw(Graphics g) {  
        // TODO Auto-generated method stub  
        g.setColor(this.getColor());  
        g.drawString("" + c, x-5, y+10);  
    }  
  
}  