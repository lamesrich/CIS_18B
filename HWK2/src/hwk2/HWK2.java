/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hwk2;
import javax.swing.JOptionPane;
/**
 *
 * @author Loui
 */
public class HWK2 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) 
    {
        
        
        
        String fn = JOptionPane.showInputDialog("What is your name ");
       
        JOptionPane.showMessageDialog(null, "Welcome to Java Programming " + fn, "Java",
                                      JOptionPane.PLAIN_MESSAGE);
        
        String userInput = JOptionPane.showInputDialog("enter course name ");
        
        
        GradeBook GBO = new GradeBook(userInput);
        GBO.displays(userInput);
        
        
    }
    
   
    
}
