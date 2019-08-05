/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversestring;

/**
 *
 * @author sri ram
 */
import java.util.*;
public class ReverseString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n,i;Scanner read=new Scanner(System.in);
        System.out.print("Enter no.of characters you want to enter");
        n=read.nextInt();char temp;
        char str[]=new char[n];
        for(i=0;i<n;i++)
        {
            char c=read.next().charAt(0);
            str[i]=c;
        }
        for(i=0;i<n/2;i++)
        {
            temp=str[i];
            str[i]=str[n-1-i];
            str[n-1-i]=temp;
        }
        String s1=new String(str);
        System.out.print("The reversed string is:  "+s1);
        
    }
    
}
