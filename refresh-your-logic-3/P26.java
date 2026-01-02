class CThread implements Runnable{
    int n;
    public CThread(int a){
        n=a;
    }
    public void run(){
        int i;
        for(i=0;i<=n;i++){
            System.out.println("i= "+i+"\t");
        }
    }
}
class P26{
    public static void main(String args[]){
        CThread p,q;
        p=new CThread(200);
        q=new CThread(250);
        Thread t1,t2;
        t1=new Thread(p);
        t2=new Thread(q);
        System.out.println("B4 Threading...");
        t1.start();
        System.out.println("BW Threading...");
        t2.start();
        System.out.println("Fininshed");
    }
}