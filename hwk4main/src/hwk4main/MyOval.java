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
public class MyOval extends MyBounded
{
    public MyOval()
    {
        super();
    }
    public void myOval(int x1, int y1, int x2, int y2, boolean f)
    {
        super(x1, y1, x2, y2, f);
    }
    
    public void myOval(int x1, int y1, int x2, int y2, Color c, boolean f)
    {
        super(x1, y1, x2, y2, c, f);
    }
    
    public void draw(Graphics g)
    {
        Color c = g.getColor();
        if(getFilled())
           g.fillOval(getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight());
        
        get.setColor(c);
    }
    public String toString()
    {
        return "Oval";
    }
    
}
