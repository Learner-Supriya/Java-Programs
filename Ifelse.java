/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifelse;

/**
 *
 * @author sri ram
 */
public class Ifelse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=10,b=90,c=9,large=a;
    if(b>large&&b>c)
    {
       large=b;
        
    }
    else
    {
        large=c;
    }
    System.out.print("largest number is :"+large);
        // TODO code application logic here
    }
    
}
