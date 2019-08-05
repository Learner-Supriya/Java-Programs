/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lcm;

/**
 *
 * @author sri ram
 */
public class Lcm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int a=3,b=5,r=a%b,lcm,product=a*b;;
         
        while(r!=0)
        {
           
           
            a=b;
            b=r;
            r=a%b;
        }
        lcm=product/b;
        System.out.print("lcm :- "+lcm);
    }
    
}
