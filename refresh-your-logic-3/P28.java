import java.util.*;
class SearchThread extends Thread{
    int start,end,key;
    int[] a;
    public SearchThread(int a[],int start,int end,int key){
        this.a=a;
        this.start=start;
        this.end=end;
        this.key=key;
    }
    public void run(){
        for(int i=start;i<end;i++){
            if(a[i]==key){
                System.out.println("Key found at index: "+(i+1));
            }
        }
    }
}
class P28{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter search key: ");
        int key=sc.nextInt();
        int threads=n/5;
        if(threads==0){
            threads=1;
        }
        for(int i=0;i<threads;i++){
            int start=i*5;
            int end=start+5;
            if(end>n){
                end=n;
            }
            SearchThread t=new SearchThread(a,start,end,key);
            t.start();
        }

    }
}