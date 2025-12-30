import java.util.*;
class Math_Oper{
    int n1,n2;
    Math_Oper(int a,int b){
        n1=a;
        n2=b;
    }
    void add(){
        System.out.print("sum= "+(n1+n2));
    }
    void subtract(){
        System.out.print("difference= "+(n1-n2));
    }
    void multiply(){
        System.out.print("product= "+(n1*n2));
    }
    void divide(){
        System.out.print("quotient= "+(n1/n2));
    } 
}
class P11{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int ch,n1,n2;
        Math_Oper obj=new Math_Oper(0,0);
        do{
            System.out.print("\n1.Get numbers\n2.Add\n3.Subtract\n4.Multiply\n5.Divide\n6.Exit\nEnter your choice: ");
            ch=s.nextInt();
            switch(ch){
                case 1:
                    System.out.print("Enter n1 and n2: ");
                    n1=s.nextInt();
                    n2=s.nextInt();
                    obj=new Math_Oper(n1,n2);
                    break;
                case 2:
                    obj.add();
                    break;
                case 3:
                    obj.subtract();
                    break;
                case 4:
                    obj.multiply();
                    break;
                case 5:
                    obj.divide();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }while(ch!=6);
    }
}