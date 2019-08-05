/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passingobject;

/**
 *
 * @author sri ram
 */
public class PassingObject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        func obj=new func();
        func ob=new func();
        obj.fun4(ob);
        System.out.println(ob.a);
    }
    
}
class func{
    int a;
    void fun4(func x)
    {
        x.a=90;
    }
}
