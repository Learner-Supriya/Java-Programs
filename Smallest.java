/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smallest;

/**
 *
 * @author sri ram
 */
public class Smallest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int a=10,b=900,c=89,small=a;
        if(small>b&&b<c)
        {
            small=b;
        }
        else if(small>c)
        { 
            small=c;
        }
        
        
                 System.out.print(small);
    }
    
}
