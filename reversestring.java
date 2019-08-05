
import java.util.*;
public class reversestring {

    public static void main(String[] args) {
        // TODO code application logic here
        int n,i;Scanner read=new Scanner(System.in);
        System.out.print("Enter no.of characters you want to enter");
        n=read.nextInt();char temp;
        char str[]=new char[n];
        for(i=0;i<n;i++)
        {
            char c=read.next().charAt(0);
            str[i]=c;
        }
        for(i=0;i<n/2;i++)
        {
            temp=str[i];
            str[i]=str[n-i];
            str[n-i]=temp;
        }
        String s1=new String(str);
        System.out.print(s1);
        
    }
    
}
