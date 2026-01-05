class CThread extends Thread{
    int n;
    public CThread(int a){
        n=a;
    }
    public void run(){
        int i;
        for(i=1;i<=n;i++){
            System.out.println("i= "+i+"\t");
        }
    }
}
class P25{
    public static void main(String args[]){
        CThread t1,t2;
        t1=new CThread(1);
        t2=new CThread(1);
        System.out.println("B4 Threading...");
        t1.start();
        System.out.println("BW Threading...");
        t2.start();
        System.out.println("Finished");
    }
}