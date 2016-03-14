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
   public int TF;
                         
   // no-argument constructor initializes the Scanner
   public Keypad()
   {
      input = new Scanner( System.in );   
      TF = -1;
   } // end no-argument Keypad constructor

   // return an integer value entered by user 
   public int getInput()
   {
       int userInput=0;
       do 
       {
           
            userInput=input.nextInt();
           if (userInput < 0) 
           {
               System.out.println("Negative numbers are not allowed");
           } 
           else if(userInput >=0)
           {
               TF=-1; 
                // we assume that user enters an integer
           }
         
           
       } while (TF !=-1);
      return userInput;
   } // end method getInput
} // end class Keypad  
