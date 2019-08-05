/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputarray;
import java.util.*;
/**
 *
 * @author sri ram
 */
public class Inputarray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n,i;
        System.out.print("Enter array length");
        Scanner read=new Scanner(System.in);
        n=read.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            System.out.println("Enter any element");
            a[i]=read.nextInt();
        }
         System.out.print("The elements in the array: ");
         for(i=0;i<n;i++)
         {
             System.out.print(a[i]+" ");
         }
        // TODO code application logic here
    }
    
}
