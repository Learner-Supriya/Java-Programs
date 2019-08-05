/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object2;

/**
 *
 * @author sri ram
 */
public class Object2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int b=78,c;
        june ob1=new june();
        june ob2=new june();
        ob1.a=30;
       /* c=ob1.a+b;
        System.out.println(ob1.a);
        System.out.println(c);*/
        ob1.display();
       // ob1.a=30;
        System.out.println(ob1.a);
        //ob1.display();
         //System.out.println(ob1.a);
        /* ob2.display();*/
    }
    
}
class june{
    int a;
    void display()
    {
        a=10;
        System.out.println(a);
    }
}
