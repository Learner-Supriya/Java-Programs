/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgprivate;

/**
 *
 * @author sri ram
 */
public class Private {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        test ob=new test();
        System.out.println(ob.display());
    }
    
}
class test
{
    private int a;
    test()
    {
        a=10;
    }
    int display()
    {
        return a;
    }
    
}