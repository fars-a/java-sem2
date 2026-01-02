import java.util.*;
class SquareThread extends Thread{
    int n;
    public SquareThread(int n){
        this.n=n;
    }
    public void run(){
        System.out.println(n+"^2= "+(n*n));
    }
}
class CubeThread extends Thread{
    int n;
    public CubeThread(int n){
        this.n=n;
    }
    public void run(){
        System.out.println(n+"^3= "+(n*n*n));
    }
}
class P29{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        SquareThread st=new SquareThread(n);
        CubeThread ct=new CubeThread(n);
        st.start();
        ct.start();
    }
}