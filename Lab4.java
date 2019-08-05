/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author sri ram
 */
import java.util.*;
public class Lab4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a student:");
        String s1=input.nextLine();
        String ob=new String(s1);
        int n=ob.length();int i,j=0;
        char c[]=new char[n];
        for(i=n-1;i>=0;i--)
        {
              
            
            c[j]=s1.charAt(i);
           
            j++;
        }
        String s2=new String(c);
        System.out.println(s2);
        
    }
    
}
