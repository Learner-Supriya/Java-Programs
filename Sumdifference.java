/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumdifference;

/**
 *
 * @author sri ram
 */
public class Sumdifference {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a[]={2,7,9,4,5,7};
        int n=a.length,i,even=0,odd=0;
        for(i=0;i<n;i=i+2)
        {
            even=even+a[i];
        }
        for(i=1;i<n;i=i+2)
        {
            odd=odd+a[i];
        }
        i=even-odd;
        System.out.print("The difference b/w the sum of elements at even indices and odd indices: "+i);
    }
    
}
