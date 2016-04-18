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

public class DrawingFrames extends JInternalFrame
{
    private String name;
    private DrawPanel drawPanel;
    private Hwk4main mains;
    private JComboBox cBox;
    
    public DrawingFrames(String title, Drawing caller)
    {
        super(title, true, true, true, true);
        mains = caller;
        name = title;
        
        //creating objects
        myColorChooser colorChooser = new MyColorChooser();
        final JSlider red = colorChooser.getRedSlider();
        red.addChangeListener(new ChangeListener()
        {
            public void stateChanged(ChangeEvent event)
            {
                drawPanel.setRed(red.getValue());
            }
        }
        
        );
        final JTextField redField = colorChooser.getRedDislay();
        redField.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent event)
            {
                drawPanel.setRed(Integer.parseInt(redField.getText()));
            }
            
        });
        final JSlider green = colorChooser.getGreenSlider();
        green.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent event)
            {
                drawPanel.setGreen(green.getValue());
            }
        });
        final JTextField greenField = colorChooser.getGreenDisplay();
        greenField.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent event)
            {
                drawPanel.setGreen(Integer.parseInt(greenField.getText()));
            }
        });
        
        final JSlider blue = colorChooser.getBlueSlider();
        blue.addChangeListener(new ChangeListener()
        {
           public void stateChanged(ChangeEvent event)
           {
               drawPanel.setBlue(blue.getValue());
           }
        });
        
        final JTextField blueField = colorChooser.getBlueDisplay();
        blueField.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent event)
           {
               drawPanel.setBlue(Integer.parseInt(blueField.getText()));
           }
        });
        
        drawPanel = new DrawPanel();
        drawPanel.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent event)
            {
                drawPanel.createShape(event.getX(), event.getY());
            }
            
            public void mouseRelease(MouseEvent event)
            {
                drawPanel.finishShape();
            }
        });
        
        drawPanel = new DrawPanel();
        drawPanel.addMouseListener(new MouseAdapter()
        {
            public void mousePressed(MouseEvent event)
            {
              drawPanel.setBlue(Integer.parseInt(blueField.getText()));  
            }
        });
        drawPanel = new DrawPanel();
        drawPanel.addMouseListener(new MouseAdapter()
        {
           public void mousePressed(MouseEvent event)
           {
               drawPanel.createShape(event.getX(), event.getY());
           }
            
           public void mouseRelease(MouseEvent event)
            {
                drawPanel.finishShape();
            }
        });
        
        drawPanel.addMouseMotionListener(new MouseMotionAdapter()
        {
           public void mouoseDragged(MouseEvent event)
           {
               drawPanel.resizeShape(event.getX(), event.getY());
           }
        });
        
        cBox = shapePanel.getChooser();
        cBox.addItemListener(new ItemListener()
        {
           public void itemStateChanged(ItemEvent event)
           {
               drawPanel.setShape((String) cBox.getSelectedItem());
           }
        });
        
        Container container = getContentPanel();
        container.setLayout(new BorderLayout());
        container.add(shapePanel, BorderLayout.NORTH);
        container.add(drawPanel, BorderLayout.CENTER);
        container.add(colorChooser, BorderLayout.SOUTH);
        
        
        addInternalFrameListener(new InternalFrameAdapter()
        {
           public void internalFrameClosed(InternalFrameEvent e)
           {
               mains.frameClosed(name);
           }
        });
        setSize(300, 300);
        
    }
        
      
        
    }

