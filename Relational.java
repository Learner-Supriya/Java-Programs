/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relational;

/**
 *
 * @author sri ram
 */
public class Relational {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int a=15,b=14;
        boolean c,d,e,f,g,h;
        c=a>b;
        d=a<b;
        e=a>=b;
        f=a<=b;
        g=a!=b;
        h=a==b;
        
        System.out.println("a>b "+c);
        System.out.println("a<b "+d);
        System.out.println("a>=b "+e);
        System.out.println("a<=b "+f);
        System.out.println("a!=b "+g);
        System.out.println("a==b "+h);
    }
    
}
