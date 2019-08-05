/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

/**
 *
 * @author sri ram
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n=-1,i,fact=1;
        if(n<0)
        {
            System.out.print("please enter non-negative numbers");
        }
        else
        {
        for(i=1;i<n;i++)
        {
            fact=fact*(i+1);
        }
        System.out.print("Factorial of "+n+" is "+fact);
        
        // TODO code application logic here
        }
    
}

}