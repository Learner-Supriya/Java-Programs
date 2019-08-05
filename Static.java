/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgstatic;

/**
 *
 * @author sri ram
 */
public class Static {
    static int a;
    int b=90;
    static void display()
    {
        a=30;
        System.out.println(a);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Static.display();
        Static obj=new Static();
        obj.a=87;
        System.out.println(obj.a);
        obj.b=45;
        System.out.println(obj.b);
        Static obj1=new Static();
        System.out.println(obj1.a);
        
        System.out.println(obj1.b);
    }
    
}
