/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randommath;

/**
 *
 * @author sri ram
 */
import java.util.*;
public class RandomMath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(((Math.random()+2)*4-7));
        Random rObj=new Random(5);
        System.out.println(rObj.nextInt());
        System.out.printf("%.3f\n",rObj.nextFloat());
        System.out.println(rObj.nextDouble());
        
    }
    
}
