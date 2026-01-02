import java.io.*;
class P21{
    public static void main(String args[]){
        int a,b,c;
        DataInputStream din=new DataInputStream(System.in);
        try{
            System.out.println("Enter a: ");
            a=Integer.parseInt(din.readLine());
            System.out.println("Enter b: ");
            b=Integer.parseInt(din.readLine());
            c=a/b;
            System.out.println(c);
        }
        catch(IOException e1){
            System.out.println("Input Output Exception: "+e1);
        }
        catch(NumberFormatException e2){
            System.out.println("Number Format Error: "+e2);
        }
        catch(ArithmeticException e3){
            System.out.println("Division by zero: "+e3);
        }
        catch(Exception e){
            System.out.println("General Exception: "+e);
        }
    }
}