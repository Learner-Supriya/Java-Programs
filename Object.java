/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object;

/**
 *
 * @author sri ram
 */
class One
{
   protected int a;
}
public class Object {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        One ob1=new One();
        ob1.a=10;
        System.out.println(ob1.a);
        One ob2=new One();
        ob2.a=19;
        System.out.println(ob2.a);
        System.out.println(ob1.a);
    }
    
}

