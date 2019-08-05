/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prime;

/**
 *
 * @author sri ram
 */
public class Prime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i=1,c,j;
        while(i<=100)
        {
         c=0; 
        for(j=1;j<=i/2;j++)
        {
            if(i%j==0)
            {
                c++;
            }
        }
        if(c==1)
        {
            System.out.print(i+" ");
        }
        i++;
        }
    }
    
}
