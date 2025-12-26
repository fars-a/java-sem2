import java.io.*;
class CLA{
  public static void main(String args[])
{
   String a=args[0];
   String b=args[1];
   int x=Integer.parseInt(a);
   int y=Integer.parseInt(b);
   int s;
   System.out.println("x="+x);
   System.out.println("y="+y);
   s=x+y;
   System.out.println("Sum="+s);
}
}