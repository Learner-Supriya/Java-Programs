/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoboxing;

/**
 *
 * @a
 * uthor sri ram
 */
public class unBoxing {
    
    void unbox()
    {
        Integer ob=23;
        int a=ob;
        System.out.println(a);
        int b=ob.intValue();
        System.out.println(b);
        
        Character ob1=65513;
        char c=ob1;
        System.out.println(c);
        int d=ob1.charValue();
        System.out.println(d);
    }
}
