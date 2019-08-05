/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package june31;

/**
 *
 * @author sri ram
 */
class test{
    int a;
    void display()
    {
        System.out.println(a);
    }
}
public class June31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        test ob1=new test();
        ob1.a=10;
        test ob2=ob1;
        ob1.display();
        ob2.display();
        ob2.a=20;
        ob1=null;
        ob1=ob2;
        ob1.display();
        ob2.display();
    }
    
}
