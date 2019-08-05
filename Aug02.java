/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aug02;

/**
 *
 * @author sri ram
 */
public class Aug02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        test ob=new test();
        ob.display(10);
        System.out.println(ob.a);
    }
    
}
class test
{
    
    int a;
    test()
    {
        a=100;
        System.out.println(a);
    }
    void display(int a)
    {
        this.a=5;
        System.out.println(this.a);
    }
}
