/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversearray;

/**
 *
 * @author sri ram
 */
public class Reversearray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a[]={31,45,6,3,72,21,67,98,65,9};
        
        int n=a.length,i,temp;
        for(i=0;i<n/2;i++)
        {
            temp=a[i];
            a[i]=a[n-i-1];
            a[n-1-i]=temp;
        }
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    
    
}
