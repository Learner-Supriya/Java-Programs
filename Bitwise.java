/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bitwise;

/**
 *
 * @author sri ram
 */
public class Bitwise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
                 int and=0&5,or=0|5,not=~2;

                System.out.println("bitwise and of 0 and 5 is "+and);
                System.out.println("bitwise or of 0 and 5 is "+or);
                System.out.println("bitwise not of 2 is "+not);
        int s=7,t,u=10;
        t=s>>2;
        System.out.println("when a is incremented by 2, the value of a is:- "+t);
        t=u<<2;
        System.out.print("when a is incremented by 2, the value of a is:- "+t);
            }
}
        // TODO code application logic here
    }
    
}
