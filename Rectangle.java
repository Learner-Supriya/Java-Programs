/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangle;

/**
 *
 * @author sri ram
 */
public class Rectangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        rec al=new rec();
        al.l=10;
        al.b=90;
        int area=al.area(al.l, al.b);
        System.out.println(area);
        int perimeter=al.perimeter(al.l,al.b);
         System.out.print(perimeter);
        // TODO code application logic here
    }
    
}
class rec
{
    int l,b;
    int area(int a,int b)
    {
        int area=a*b;
        return area;
    }
    int perimeter(int a,int b)
    {
        int per=(a+b)*2;
        return per;
    }
}
