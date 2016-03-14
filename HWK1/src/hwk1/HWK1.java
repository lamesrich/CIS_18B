/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hwk1;

/**
 *
 * @author Loui
 */
public class HWK1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello World");
        int [] num1 = {10, 20, 30};
        products(num1);
         System.out.println("");
        for(int i=0; i<num1.length; i++)
        {
             if(num1[i]<num1[i]+1)
            {
                System.out.println(num1[i]+" is lessthan "+num1[i+1]);
            }
           if(num1[i+1]>num1[i])
            {
                System.out.println(num1[i+1]+" is greaterthan "+num1[i]);
            }
            
        }
        
        
        
        
    }
    public static void products(int [] num1)
    {
        int sum=1;
       for(int i=0; i<num1.length; i++)
       {
           System.out.printf("%d ",num1[i]);
           
       }
       
       
       for(int i: num1)
       {
           sum=sum * i;
           
       }
       System.out.println("\nThe product is: "+sum);
    }
    
}
