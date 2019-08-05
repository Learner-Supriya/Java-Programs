/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor;

/**
 *
 * @author sri ram
 */
public class Constructor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        test ob=new test();
        ob.display();
        test ob1=new test();
        
        
    }
    
}
class test{
    int a;
    test()
    {
        a=98;
        System.out.println(a);
       
    }
    void display()
    {
        
        a=90;
        System.out.println(a);
        print();
       
    }
    void print()
    {
        System.out.println("Hai");
    }
    }

