/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package returnobject;

/**
 *
 * @author sri ram
 */
public class ReturnObject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        func obj=new func();
        func ok=obj.fun();
        System.out.println(ok.a); 
        
    }
    
}
class func{
    int a;
    func fun()
    {
        func ob1=new func();
        ob1.a=20;
        return ob1;
    }
}
