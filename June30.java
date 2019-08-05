/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package june30;

/**
 *
 * @author sri ram
 */
public class June30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        test ob=new test();
        test ob2=new test();
        ob2.display(ob);
        ob.a=70;
        ob2.display(ob);
        System.out.println(ob2.a);
    }
    
}
class test
{
    int a;
    test()
    {
        a=10;
        System.out.println(a);
    }
    void display(test ob)
    {
        System.out.println("Inside="+ob.a);
        a=ob.a;
        System.out.println("value="+a);
    }
}
