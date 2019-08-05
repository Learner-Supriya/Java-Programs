/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringoperations;

/**
 *
 * @author sri ram
 */
public class Stringoperations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s1="My Name is ",s2="Supriya",s3;
        s3=s1.concat(s2);
        System.out.println(s3);
        int n=s3.compareTo(s1);//returns 3 possible values =0,<0,>0
        System.out.println(n);
        String s4="my name is supriya";
        //int n1=s3.compareTo(s4);//returns 3 possible values =0,<0,>0
        //System.out.println(n1);
        String s5=s3.toLowerCase();
        System.out.println(s5);
        String s6=s3.toUpperCase();
        System.out.println(s6);
        String s7=s2.substring(2,5);
        System.out.println(s7);
        String s8=s2.substring(2);
        System.out.println(s8);
        //String s9=s3.replace(s2,"srihari");
        //System.out.println(s9);
        int j=s3.hashCode();
        System.out.println(j);
        int i=s3.indexOf('s');
        System.out.println(i);
        String s10=s3.replace("is","Si");
        System.out.println(s10);
        String s11=s10.replace('s','S');
        System.out.println(s11);
        String s12=s11.replace(' ','_');
        System.out.println(s12);
        boolean b=s1.startsWith(" ");
        System.out.println(b);
        boolean k=s3.equals(s4);
        System.out.println(k);
        System.out.println(s3);
        
        
        
    }
    
}
