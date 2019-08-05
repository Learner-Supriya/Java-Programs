/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string1;

/**
 *
 * @author sri ram
 */
import java.util.*;
public class String1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s1="hello";
        System.out.print(s1);
        String s2=new String();
        s2="Iam ";
        System.out.println(s2);
        String s3=new String(" Supriya Ede");
        System.out.println(s3);
        char str[]={'w','e','l','c','o','m','e'};
        String s4=new String(str);
        String s5=new String(str,3,4);
        System.out.println(s5);
        Scanner read=new Scanner(System.in);
        String newstr=read.nextLine();
        
    }
    
}
