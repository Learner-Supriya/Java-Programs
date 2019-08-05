/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elseif;

/**
 *
 * @author sri ram
 */
public class Elseif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=10000,b=900,c=8989,large=a;
        if(large<b&&b>c)
        {
            large=b;
        }
        else if(large<c)
        { 
            large=c;
        }
        
        
                 System.out.print(large);
            
    }
    
}
