package visualtool.tree;

import java.awt.Color;  
import java.awt.Graphics;  
  
/** 
 * 形状抽象类，所有的形状都必须继承的类 
 * @author Micro 
 * 
 */  
public abstract class Shape {  
      
    private Color c;//颜色  
      
      
    public void setColor(Color c){  
        this.c = c;  
    }  
      
    public Color getColor(){  
        return c;  
    }  
    /** 
     * 绘制的方法 
     * @param g 
     */  
    public abstract void draw(Graphics g);  
  
}