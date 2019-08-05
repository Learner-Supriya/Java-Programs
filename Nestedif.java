/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nestedif;

/**
 *
 * @author sri ram
 */
public class Nestedif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=90,b=9,c=8;
        if(a>b) 
        {
            if(a>c)
            {
                System.out.print(a);
            }
            else
            {
                 System.out.print(c);
            }
        }
        else
        {
            if(b>c)
            {
               System.out.print(b);  
            }
            else
            {
                 System.out.print(c);
            }
            
          
        }
        // TODO code application logic here
    }
    
}
