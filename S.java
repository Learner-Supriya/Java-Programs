/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s;

/**
 *
 * @author sri ram
 */
public class S {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=3,i=0,j;
        while(i<=2*n)
        {
            if(i==0||i==n||i==2*n)
            {
              j=0;
              while(j<=n)
              {
                  System.out.print("* ");
                  j++;
              }
              
            }
            else if(i<n)
            {
                 System.out.print("*");
            }
            else
            {
                j=0;
                while(j<2*n)
                {
                     System.out.print(" ");
                     j++;
                }
                 System.out.print("*");
            }
                
            i++;
             System.out.println("");
        }
        
    }
    
}
