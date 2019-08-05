/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoboxing;

/**
 *
 * @author sri ram
 */
public class Autoboxing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=10;
        Integer ob=a;
        System.out.println(ob);
        Integer ob1=Integer.valueOf(a);
        System.out.println(ob1);
        unBoxing c2=new unBoxing();
        c2.unbox();
        
    }
    
}
