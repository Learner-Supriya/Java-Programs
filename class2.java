/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringbuffer;

/**
 *
 * @author sri ram
 */
public class class2 {
    void sb()
    {
    
    StringBuffer ob=new StringBuffer("this is my country");
    StringBuffer s=ob.append(" and my country name is India");
    System.out.println(s);
    ob.replace(3,7,"replaced");
    System.out.println(s);
    ob.reverse();
     System.out.println(s);
     ob.insert(3, "this is me ");
    System.out.println(s);
    ob.delete(14,55);
    System.out.println(s);
    }    
    
}
