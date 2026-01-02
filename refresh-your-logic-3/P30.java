class CThread extends Thread{
    String document;
    int page_no;
    public CThread(String document,int page_no){
        this.document=document;
        this.page_no=page_no;
    }
    public void run(){
        for(int i=1;i<=page_no;i++){
            System.out.println("Printing "+document+"...Page No: "+i);
        }
        try{
            Thread.sleep(500);
        }
        catch(Exception e){
            System.out.println("Interrupt occured");
        }
        System.out.println("Finished printing "+document);
    }
}
class P30{
    public static void main(String args[]){
        CThread t1=new CThread("DOCUMENT 1",2);
        CThread t2=new CThread("DOCUMENT 2",5);
        CThread t3=new CThread("DOCUMENT 3",2);
        t1.start();
        t2.start();
        t3.start();
    }
}