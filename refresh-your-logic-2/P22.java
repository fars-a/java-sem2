import java.util.*;
class UDE extends Exception{
    String strError;
    public UDE(){
        strError="Unknown error";
    }
    public UDE(String str){
        strError=str;
    }
    public String printError(){
        return strError;
    }
}
class P22{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a: ");
        int a=s.nextInt();
        System.out.println("Enter b: ");
        int b=s.nextInt();
        int c;
        try{
            if(b==0){
                throw new UDE("Denominator is zero");
            }
            c=a/b;
            System.out.println(c);
        }
        catch(UDE e){
            System.out.println(e.printError());
        }
    }
}