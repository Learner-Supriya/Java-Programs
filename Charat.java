/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charat;

/**
 *
 * @author sri ram
 */
import java.util.*;
public class Charat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str="This is my world";
        char n=str.charAt(9);
        System.out.println("character at index 9 :"+n);
        int m=str.indexOf('i');
        System.out.print("Index of i is "+m);
    }
    
}
