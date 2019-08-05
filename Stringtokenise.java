/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringtokenise;

/**
 *
 * @author sri ram
 */
import java.util.*;
public class Stringtokenise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str="hello iam supriya ede,my brother is charan sri hari";
        StringTokenizer someobj=new StringTokenizer(str);
        System.out.println(someobj.countTokens());
        System.out.println(someobj.nextToken());
         System.out.println(someobj.nextToken());
         System.out.println(someobj.nextToken(" "));
         System.out.println(someobj.countTokens());
         StringTokenizer someobj1=new StringTokenizer(str,",");
        System.out.println(someobj1.countTokens());
         System.out.println(someobj1.nextToken());
         System.out.println(someobj1.nextToken());
         System.out.println(someobj1.countTokens());
          System.out.println(someobj1.hasMoreTokens());
           StringTokenizer someobj3=new StringTokenizer(str,",",true);
        System.out.println(someobj3.countTokens());
         
        
    }
    
}
