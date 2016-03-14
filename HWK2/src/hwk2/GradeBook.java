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
public class GradeBook {
    public GradeBook(String userInput)
    {
        displays(userInput);
    }
    public void displays(String userInput)
    {
        JOptionPane.showMessageDialog(null, "COURSE NAME IS "+userInput, "Course", 
                                      JOptionPane.PLAIN_MESSAGE);
    }
    
    
}
