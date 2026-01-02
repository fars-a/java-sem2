import java.util.*;
class CThread extends Thread{
    int n,start;
    public CThread(int start,int n){
        this.start=start;
        this.n=n; 
    }
    public void run(){
        int i;
        for(i=start;i<=n;i+=2){
            if(i%2==0){
                System.out.println("Even= "+i);
            }
            else{
                System.out.println("Odd= "+i);
            }
        }
    }
}
class P27{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        CThread t1,t2;
        System.out.println("Let us print Odd-Even Numbers...\nEnter N: ");
        int n=sc.nextInt();
        t1=new CThread(1,n);
        t2=new CThread(2,n);
        t1.start();
        t2.start();
    }
}