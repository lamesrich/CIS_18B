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

public class drawPanel extends JPanel
{
    private MySape shape;
    private boolean fill;
    private int red, green, blue;
    
    public drawPanel(MyShape s)
    {
        shape = s;
    }
    
    public drawPanel()
    {
        shape = null;
    }
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        if(shape != null)
            shape.draw(g);
    }
    
    public void createShape(int x, int y, String type)
    {
        Color color = new Color(red, green, blue);
        if(type.equals("Rectangle"))
            shape = new MyRectacgle(x, y, x, y, color, fill);
        else if(type.equals("Line"))
            shape = new MyLine(x, y, x, y, color, fill);
        else
        shape = new myOval(x, y, x, y, color, fill);
        repaint();
    }
    //mouse movements
    public void resizeShape(int x, int y)
    {
        shape.setX2(x);
        shape.setY2(y);
        repaint();
    }
    
    public void setFill(boolean f)
    {
        fill = f;
        if(shape instanceof MyBounded)
            ((MyBounded shape).setFilled(f));
        repaint();
    }
    
    public void setShape(String type)
    {
        int x1 = shape.getX1();
        int y1 = shape.getY1();
        int x2= shape.getX2();
        int y2 = shape.getY2();
        Color color = new Color(red, green, blue);
        
        if(type.equals("Rectangle"))
            shape = new MyRectacgle(x, y, x, y, color, fill);
        else if(type.equals("Line"))
            shape = new MyLine(x, y, x, y, color, fill);
        else
            shape = new myOval(x, y, x, y, color, fill);
            repaint();
    }
    
    
    public void setRed(int r)
    {
        red = r;
        shape.setColor(new Color(red, green, blue));
        repaint();
    }
    
    public void setGreen(int g)
    {
        green = g;
        shape.setColor(new Color(red, green, blue));
        repaint();
    }
    
    public void setBlue(int b)
    {
        blue = b;
        shape.setColor(new Color(red, green, blue));
        repaint();
    }
 
}