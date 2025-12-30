import java.util.*;
class Complex{
    int real;
    int imaginary;
    void read(Scanner s){
        System.out.print("Enter the real part: ");
        real=s.nextInt();
        System.out.print("Enter the imaginary part: ");
        imaginary=s.nextInt();

    }
    void disp(){
        System.out.println(real+" + "+imaginary+"i");
    }
    void add(Complex c1,Complex c2){
        real=c1.real+c2.real;
        imaginary=c1.imaginary+c2.imaginary;
    }
    void mul(Complex c1,Complex c2){
        int r=(c1.real*c2.real)-(c1.imaginary*c2.imaginary);
        int i=(c1.real*c2.imaginary)+(c1.imaginary*c2.real);
        real=r;
        imaginary=i;
    }
}
class P12{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        Complex c1=new Complex();
        Complex c2=new Complex();
        Complex r1=new Complex();
        int ch;
        do{
            System.out.print("\nRead numbers\n2.Display numbers\n3.Add numbers\n4.Multiply numbers\n5.Exit\nEnter your choice: ");
            ch=s.nextInt();
            switch(ch){
                case 1:
                    System.out.println("Enter c1");
                    c1.read(s);
                    System.out.println("Enter c2");
                    c2.read(s);
                    break;
                case 2:
                    c1.disp();
                    c2.disp();
                    break;
                case 3:
                    r1.add(c1,c2);
                    r1.disp();
                    break;
                case 4:
                    r1.mul(c1,c2);
                    r1.disp();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }while(ch!=5);
    }
} 











