/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coprime;

/**
 *
 * @author sri ram
 */
public class Coprime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=2,b=54,r=a%b;
       
        while(r!=0)
        {
           
           
            a=b;
            b=r;
            r=a%b;
        }
        if(b==1)
        {
            System.out.print("Given numbers are co-primes");
        }
        else
        {
         System.out.print("Given numbers are not co-primes");   
        }
        // TODO code application logic here
    }
    
}
