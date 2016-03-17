/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hwk1main;

/**
 *
 * @author mvc
 */
import java.util.Scanner; // program uses Scanner to obtain user input

public class Keypad
{
   private Scanner input; // reads data from the command line
   
                         
   // no-argument constructor initializes the Scanner
   public Keypad()
   {
      input = new Scanner( System.in );   
    
   } // end no-argument Keypad constructor

   // return an integer value entered by user 
   public int getInput()
   {
       String userInput= input.next();  
       boolean val=true;
       int numInt=0;
       //Input validation
       do
      {  
         
        val=numeric(userInput);
        
        if(val==true)
        {
            numInt = Integer.parseInt(userInput);
             
        }
        else
        {
            System.out.println("Please enter a positive number");
            userInput= input.next();
            
        }
      }while(!(val)); 
      return numInt;
   } // end method getInput

public static boolean numeric(String num)
    {
        boolean val = true;
         if(num.matches("^[+]?\\d+(\\,/*\\d+)?$"))
        {
            val=true;
        }
        else
        {
            val=false;
        }
         
        return val;
    }

} // end class Keypad  
