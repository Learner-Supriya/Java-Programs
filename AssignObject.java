/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignobject;

/**
 *
 * @author sri ram
 */
public class AssignObject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        one obj=new one();
        obj.a=90;
        System.out.println(obj.a);
        one ob=new one();
        ob.a=11;
        obj=ob;
        System.out.println(ob.a);
        System.out.println(obj.a);
    }
    
}
class one{
    int a;
}
