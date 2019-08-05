/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodoverloading;

/**
 *
 * @author sri ram
 */
import java.lang.*;
public class MethodOverloading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        one area=new one();
        area.area(7,9);
         area.area(6.5f);
          area.area(7.6,9.8);
        
    }
    
}
class one{
    int l,b;
    float r;
    double d,h;
    void area(int x,int y)
    {
        l=x;b=y;
        System.out.println("Area of rectangle with length "+l+" and breadth "+b+" is "+l*b);
    }
    void area(float f)
    {
        r=f;
        System.out.println("Area of circle with radius "+f+" is "+Math.PI*r*r);
    }
    void area(double x,double y)
    {
        d=x;h=y;
        System.out.println("Area of trainge with altitude "+h+" and base "+d+" is "+d*h/2);
    }
    
}