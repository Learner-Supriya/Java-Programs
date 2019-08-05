/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package large3array;

/**
 *
 * @author sri ram
 */
public class Large3array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a[]={2,3,1};
        int n=a.length,large=a[0],temp=a[0],i;
        for(i=1;i<n;i++)
        {
            if(a[i]>large)
            {
                temp=large;
                large=a[i];
            }
        }
        System.out.print("second largest in the array: "+temp);
        
    }
    
}
