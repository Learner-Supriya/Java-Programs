/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysum;

/**
 *
 * @author sri ram
 */
public class Arraysum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a[]={3,5,7,2,3};
        int i,sum=0;
        for(i=0;i<5;i++)
        {
            sum=sum+a[i];
        }
        System.out.print("Sum of the elements in the array:"+sum);
    }
    
}
