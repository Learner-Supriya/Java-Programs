/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgswitch;

/**
 *
 * @author sri ram
 */
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=10,b=90,result=0;
        char c='$';
        switch(c)
        {
            case '+':
                result=a+b;
                break;
            case '-':
                result=a-b;
                break;
            case '*':
                result=a*b;
                break;
            case '/':
                result=a/b;
                break;
            case '%':
                result=a%b;
                break;
            default:
                System.out.print("invalid operator");
            
                    
        }
        
             System.out.print(result);
        
       
        // TODO code application logic here
    }
    
}
