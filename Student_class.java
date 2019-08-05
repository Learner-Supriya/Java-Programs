/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student_class;

/**
 *
 * @author sri ram
 */
public class Student_class {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        details obj=new details();
        obj.roll_no=32;
        obj.id_no=160836;
        obj.name="Supriya";
        obj.display();
        
        details obj1=new details();
        obj1.roll_no=5;
        obj1.id_no=160266;
        obj1.name="Triveni";
        obj1.display();
    }
    
}
class details{
    String name;
    int roll_no;
    long id_no;
    void display(){
        System.out.println(name);
        System.out.println(id_no);
        System.out.println(roll_no);
         
         
    }
}
