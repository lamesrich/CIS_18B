/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hwk4main;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.io.*;


abstract class MyShape implements Serializable
{
    private int x1=0, y1=0, x2=0, y2=0;
    private Color color;
   
    public MyShape(int x1, int y1, int x2, int y2)
    {
        this(x1, y1, x2, y2, Color.black);
    }
    public MyShape(int x1, int y1, int x2, int y2, Color c)
    {
        setAll(x1, y1, x2, y2, c);
    }
    
    public final void setAll(int x1, int y1, int x2, int y2, Color c)
    {
        setX1(x1);
        setY1(y1);
        setX2(x2);
        setY2(y2);
        setColor(c);
    }
    public final void setX1(int x)
    {
        x1 = x;
    }
    public final int getX1()
    {
        return x1;
    }
    
    public final void setY1(int y)
    {
        y1 = y;
    }
    public final int getY1()
    {
        return y1;
    }
    
    public final void setX2(int x)
    {
        x2 = x;
    }
    public final int getX2()
    {
        return x2;
    }
    
    public final void setY2(int y)
    {
        y2 = y;
    }
    public final int getY2()
    {
        return y2;
    }
    
    public final void setColor(Color c)
    {
        color = c;
    }
    public Color getColor()
    {
        return color;
    }
    
    public abstract void draw(Graphics g);
}


