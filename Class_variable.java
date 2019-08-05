/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_variable;

/**
 *
 * @author sri ram
 */
public class Class_variable {

    /**
     * @param args the command line arguments
     */
    int a;
    static int b;
    Class_variable(int v)
    {
        b=v;
        System.out.println(b);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Class_variable object=new Class_variable(15);
         Class_variable object1=new Class_variable(25);
          System.out.println(b);
           System.out.println(one.c);
          System.out.println(object.b);
          object.a=20;
          object1.a=34;
          System.out.println(object1.a);
          System.out.println(object.a);
          
         
    }
    
}
class one{
    static int c;
    
}
