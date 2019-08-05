/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package increment;

/**
 *
 * @author sri ram
 */
public class Increment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=11,b=5,c,d,e,f;
        System.out.print((b++));
        c=++a+b;
        System.out.println("to show pre increment of a:-"+c);
        d=a+b++;
        System.out.println("d:-"+d);
        System.out.println("to show post incrementof b:-"+b);
        e=--a+b;
        System.out.println("e:-"+e);
        f=a+b--;
        System.out.println("f:-"+f);
        System.out.println("to show post decrementof b:-"+b);
       
        // TODO code application logic here
    }
    
}
