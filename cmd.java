public class cmd{
  public static void main(String[] args){
   /***To take inputs from cmd prompt***/
   int n=args.length,i;
   System.out.print(n);
    for(i=0;i<n;i++)
          {
            System.out.print(args[i]);
          }
   /***to convert cmd line arguments into integers***
    int a,b,c;
    a=Integer.parseInt(args[0]);
    b=Integer.parseInt(args[1]);
    c=Integer.parseInt(args[2]);
    System.out.print(a+b+c);*/
}
}