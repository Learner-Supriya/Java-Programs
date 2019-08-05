/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package do_while;

/**
 *
 * @author sri ram
 */
public class Do_while {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i=1;
        do
        {
         if(i%2==0)
         {
             System.out.println(i);
         }
       i++;
        }while(i<=10);
        // TODO code application logic here
    }
    
}
