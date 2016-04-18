/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hwk4main;

/**
 *
 * @author Loui
 */
public class MyLine extends MyShape
{
    public myLine()
    {
        super();
    }
    
    public MyLine(int x1, int y1, int x2, int y2)
    {
        super(x1, y1, x2, y2);
    }
    
     public MyLine(int x1, int y1, int x2, int y2, Color c)
    {
        super(x1, y1, x2, y2, c);
    }
     
    public void draw(Graphics g)
    {
        Color c = g.getColor()
        g.setColor(this.getColor());
        g.drawLine(getX1(), getY1(), getX2(), getY2());
        g.setColor(c);//reset color
    }
    
    public String toString()
    {
        return "Line";
    }
}
