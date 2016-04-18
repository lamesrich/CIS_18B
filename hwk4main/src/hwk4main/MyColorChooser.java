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
/**
 *
 * @author Loui
 */
public class MyColorChooser extends JPanel
{
    private JSlider redSlider, blueSlider, greenSlider;
    private JTextField redDisplay, blueDisplay, greenDisplay;
    private JLabel redLabel, blueLabel, greenLabel;
    private Color color;
    
    public MyColorChooser()
    {
        redLabel = new JLabel("Red:");
        redSlider = new JSlider(SwingConstants.HORIZONTAL, 0, 255, 1);
        redDisplay = new JTextField("0", 4);
        
        greenLabel = new JLabel("Green:");
        greenSlider = new JSlider(SwingConstants.HORIZONTAL, 0, 255, 1);
        greenDisplay = new JTextField("0", 4);
        
        blueLabel = new JLabel("Blue:");
        blueSlider = new JSlider(SwingConstants.HORIZONTAL, 0, 255, 1);
        blueDisplay = new JTextField("0", 4);
        
        setLayout(new GridLayout(3, 3));
        
        add(redLabel);
        add(redSlider);
        add(redDisplay);
        
        add(blueLabel);
        add(blueSlider);
        add(blueDisplay);
        
        add(greenLabel);
        add(greenSlider);
        add(greenDisplay);
        
        redSlider.addChangeListener(new ChangeHandler());
        blueSlider.addChangeListener(new ChangeHandler());
        greenSlider.addChangeListener(new ChangeHandler());
        
        redDisplay.addActionListener(new ActionHandler());
        blueDisplay.addActionListener(new ActionHandler());
        greenDisplay.addActionListener(new ActionHandler());
        
        color = Color.black;
        
    }//end of constructor
    
    public void setColor(Color c)
    {
        color =c;
        redSlider.setValue(c.getRed());
        redDisplay.setText(String.valueOf(c.getRed()));
        
        greenSlider.setValue(c.getGreen());
        greenDisplay.setText(String.valueOf(c.getGreen()));
        
        blueSlider.setValue(c.getBlue());
        blueDisplay.setText(String.valueOf(c.getBlue()));
    }
    public Color getColor()
    {
        return color;
    }
    
    public JSlider getRedSlider()
    {
        return redSlider;
    }
    
    public JSlider getGreenSlider()
    {
        return greenSlider;
    }
    
    public JSlider getBlueSlider()
    {
        return blueSlider;
    }
    
    //getting text fields
    public JTextField getRedDisplay()
    {
        return redDisplay;
    }
    
    public JTextField getGreenDisplay()
    {
        return greenDisplay;
    }
    
    public JTextField getBlueDisplay()
    {
        return blueDisplay;
    }
    //sider event handler
    private class ChangeHandler implements ChangeListener
    {
        public void stateChanged(ChangeEvent event)
        {
            int red = redSlider.getValue();
            int green=greenSlider.getValue();
            int blue= blueSlider.getValue();
            
            color = new Color(red, green, blue);
            
            redDisplay.setText(String.valueOf(red));
            greenDisplay.setText(String.valueOf(green));
            blueDisplay.setText(String.valueOf(blue));
        }
    }//private class ends
    
}//end class
