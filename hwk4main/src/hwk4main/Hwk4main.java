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
public class Hwk4main extends JFrame
{
    private JInternalFrame [] IFrames;
    private JMenuItem [] frameMenus;
    private JDesktopPane DPane;
    private JMenu menuPanel;
    private JMenuItem itemMenus;
    private int count =0;
    private static final int max = 20;
    
    public Hwk4main()
    {
        super("Homework Number 4");//Title of program frame
        
        //intializing global variables
        DPane = new JDesktopPane();
        IFrames = new JInternalFrame [max];
        frameMenus = new JMenuItem [max];
        menuPanel = new JMenu();
        itemMenus = new JMenuItem();
        
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        
        getContentPane().add(DPane);
        fileMenu.setMnemonic('f');
        itemMenus.setMnemonic('n');
        fileMenu.add(itemMenus);
        itemMenus.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent event)
         {
            String title = "picture" + (count + 1);
            IFrames[count] = new DrawingFrames(title, DrawingFrames.this);
            DPane.add(IFrames[count]);
            IFrames [count].setVisible(true);
            
            //creating menu items
            frameMenus[count] = new JMenuItem(title);
            menuPanel.add(frameMenus[count]);
            frameMenus [count].addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent event)
                {
                    String call = event.getActionCommand();
                    int num=Integer.parseInt(call.substring(7));
                    IFrames [num-1].toFront();
                }
            }
            );
                 count++;
                 
                 if(count == max)
                     itemMenus.setEnabled(false);
                          
                          
           } 
        }
        );
        JMenuItem exiting = new JMenuItem("Exit");
        exiting.setMnemonic('e');
        fileMenu.add(exiting);
        menuBar.add(fileMenu);
        exiting.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent event)
                    {
                        System.exit(0);
                    }
                            
                }
        );
        
        menuPanel =new JMenu("Window");
        menuBar.add(menuPanel);
        setJMenuBar(menuBar);
        setSize(900, 900);
        setVisible(true);
        
    }
    
    public void frameClosed(String window)
    {
        int num = Integer.parseInt(window.substring(7));
        menuPanel.remove(frameMenus[num-1]);
        frameMenus[num-1]=null;
    }
    

    
    public static void main(String[] args) 
    {
        Hwk4main apps = new Hwk4main();
        apps.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }//end main
    
}//end Hwk4main class
