/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hwk4main;

import java.awt.Color;

/**
 *
 * @author Loui
 */
abstract class MyBounded extends MyShape
{
    private boolean filled;
    
    public MyBounded()
    {
        super();
        setFilled(false);
    }
    public MyBounded(int x1, int y1, int x2, int y2, boolean f)
    {
        super(x1, y1, x2, y2);
        setFilled(f);
    }
    public MyBounded(int x1, int y1, int x2, int y2, Color c, boolean f)
    {
        super(x1, y1, x2, y2, c);
        setFilled(f);
    }
    
    public final void setAll(int x1, int y1, int x2, int y2, Color c, boolean f)
    {
        super.setAll(x1, y1, x2, y2, c);
        setFilled(f);
    }
    
    public void setFilled(boolean f)
    {
        filled = f;
    }
    public boolean getFilled()
    {
        return filled;
    
    }
    
    public int getUpperLeftX()
    {
        return Math.min(getX1(), getX2());
        
    }
     public int getUpperLeftY()
    {
        return Math.min(getY1(), getY2());
        
    }
     
    public int getWidth()
    {
        return Math.abs(getX1() - getX2());
    }
    
    public int getHeight()
    {
        return Math.abs(getY1()-getY2());
    }
}
