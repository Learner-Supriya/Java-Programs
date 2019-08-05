/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decrement;

/**
 *
 * @author sri ram
 */
public class Decrement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=22,b=11,c,d;
        c=--a+b;
        d=a+b--;
        System.out.println("to show pre increment of a:- "+c);
        System.out.println("to show post incrementof b:- "+d);
        System.out.print("to show post incrementof b:- "+b);
        // TODO code application logic here
    }
    
}
