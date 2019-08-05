/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functions;

/**
 *
 * @author sri ram
 */
public class Functions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        func obj=new func();
        double f1=obj.fun1();
        System.out.println(f1);
        obj.fun2(45);
        char c=obj.fun3(56);
        System.out.println(c);
        //pass object
        func ob=new func();
        obj.fun4(ob);
        System.out.println(ob.a);
        //return object
        func ok=obj.fun5();
        System.out.println(ok.a); 
        System.out.println(obj.a);
        obj=ob;
        System.out.println(obj.a);
        
        
    }
    
}
class func
{
    int a;
    double fun1()
            {
               a=19;
               return 'a';
            }
    void fun2(int b)
    {
        a=b;
        System.out.println(a);
    }
    char fun3(int b)
    {
     a=b;
     System.out.print(a+" ");
     return 47;
    }
    void fun4(func x)
    {
        x.fun2(6);
    }
    func fun5()
    {
        func ob1=new func();
        ob1.a=20;
        return ob1;
    }
}
