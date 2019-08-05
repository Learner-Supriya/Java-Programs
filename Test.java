/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author sri ram
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    static int a=10;
    static int b;
    static void print()
    {
        System.out.println(a);
        System.out.println(b);
        
    }
    public static void free(){
        System.out.println("static");
        b=a*20;
    }
    public static void main(String[] args) {
        // TODO code application logic here
     System.out.println("main");
     print();
     free();
    }
    
}
