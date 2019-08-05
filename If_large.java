/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if_large;

/**
 *
 * @author sri ram
 */
public class If_large {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int a=10,b=7,c=8;
         if(a>b&&a>c)
         {
              System.out.print("largest number is :"+a);
         }
         if(b>a&&b>c)
         {
              System.out.print("largest number is :"+b);
         }
         if(c>a&&c>b)
         {
              System.out.print("largest number is :"+c);
         }
        // TODO code application logic here
    }
    
}
