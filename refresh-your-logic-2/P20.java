import java.util.*;
interface ishape{
    public void draw();
    public void mov();
}
class Circle implements ishape{    //Circle class implementing ishape
    public void draw(){
        System.out.println("Drawing circle");
    }
    public void mov(){
        System.out.println("Moving circle");
    }
}
class Rectangle implements ishape{   //Rectangle class implementing ishape
    public void draw(){
        System.out.println("Drawing rectangle");
    }
    public void mov(){
        System.out.println("Moving rectangle");
    }
}
class P20{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int ch;
        ishape i;
        do{
            System.out.print("\n1.Circle\n2.Rectangle\n3.Exit\nEnter your choice: ");
            ch=s.nextInt();
            switch(ch){
                case 1:
                    i=new Circle();
                    i.draw();
                    i.mov();
                    break;
                case 2:
                    i=new Rectangle();
                    i.draw();
                    i.mov();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Wrong chocie!");
            }
        }while(ch!=3);
    }
}