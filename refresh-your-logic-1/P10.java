import java.util.*;
class R_print{
    void ascending_Order(int n){
        if(n<1){
            return;
        }
        ascending_Order(n-1);
        System.out.print(n + "\t");
    }
    void descending_Order(int n){
        if(n<1){
            return;
        }
        System.out.print(n+"\t");
        descending_Order(n-1);
    }
}
class P10{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        R_print r=new R_print();
        int ch;
        int n=0;
        do{
            System.out.println("\n1.Get n\n2. Display from 1 - n\n3. Display from n - 1\n4.Exit\nYour choicce: ");
            ch=s.nextInt();
            switch(ch){
                case 1:
                    System.out.println("Enter n: ");
                    n=s.nextInt();
                    break;
                case 2:
                    r.ascending_Order(n);
                    break;
                case 3:
                    r.descending_Order(n);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Wrong choice!");
            }
        }while(ch!=4);
    }
}