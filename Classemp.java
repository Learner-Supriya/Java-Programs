/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classemp;

/**
 *
 * @author sri ram
 */
import java.util.*;
class employee{
    String name;
    int Id;
    int salary;
    String address;
    
    void read()
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter employee name");
        name=input.nextLine();
        System.out.println("Enter employee id");
        Id=input.nextInt();
        System.out.println("Enter employee salary");
        salary=input.nextInt();
        System.out.println("Enter employee address");
        address=input.nextLine();
        
    }
    void print()
    {
        System.out.printf("Employee name :%4s\n",name);
        System.out.printf("Employee name :%4d\n",Id);
        System.out.printf("Employee name :%4d\n",salary);
        
    }
}
public class Classemp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        employee ob=new employee();
        System.out.println(ob.address);
        ob.read();
        ob.print();
    }
    
}
