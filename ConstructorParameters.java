/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructorparameters;

/**
 *
 * @author sri ram
 */
public class ConstructorParameters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        test ob1=new test();
        test ob2=new test(78);
        test ob3=new test(25,15);
        
    }
    
}
class test
{
    int a,b;
    test()
    {
        System.out.println("No parameters");
        a=10;b=20;
        System.out.println(a+" "+b);
    }
    test(int x)
    {
       
        a=x;b=x;
        System.out.println(a+" "+b);
    }
    test(int x,int y)
    {
        
        a=x;b=y;
        System.out.println(a+" "+b);
    }
}
