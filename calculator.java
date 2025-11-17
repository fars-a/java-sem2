import java.io.*;
class calculator{
   public static void main(String args[])
{
  if(args.length<3)
  {
     System.out.println("Pass 3 arguments");
     return;
  }
  int a,b,op;
  a=Integer.parseInt(args[0]);
  b=Integer.parseInt(args[1]);
  op=Integer.parseInt(args[2]);
  switch(op)
  {
     case 0:
         System.out.println("Sum= "+(a+b));
         break;
     case 1:
         System.out.println("Difference= "+(a-b));
         break;
     case 2:
         System.out.println("Product= "+(a*b));
         break;
     case 3:
         if(b==0)
         {
             System.out.println("Division not possible!");
         }
         else
       {
          System.out.println("Quotient= "+(a/b));
     }
     break;
  case 4:
     if(b==0)
     {
          System.out.println("Division not possible!");
     }
     else
     {
     System.out.println("Remainder= "+(a%b));
     }
     break;
  default:
     System.out.println("wrong choice!");
     }
  }
}