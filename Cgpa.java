/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cgpa;

/**
 *
 * @author sri ram
 */
public class Cgpa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int DBMS=10,DAA=10,OOPS=10,IR=9,OS=9,cgpa,db,da,op,ir,os,point,tc;
        db=DBMS*4;
        da=DAA*4;
        op=OOPS*4;
        ir=IR*2;
        os=OS*4;
        tc=4+4+4+4+2;
        cgpa=(db+da+op+ir+os)/tc;
        point=(((db+da+op+ir+os)%tc)*10)/tc;
        System.out.print("your CGPA is :"+cgpa+"."+point);
    }
    
}
