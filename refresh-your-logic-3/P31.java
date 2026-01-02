class Printer{
    public synchronized void print(String document,int page_no){
        try{
            for(int i=1;i<=page_no;i++){
            System.out.println("Printing "+document+"...Page No: "+i);
            Thread.sleep(500);
        }
        }
        catch(Exception e){
            System.out.println("Interrupt occured");
        }
        System.out.println("Finished printing "+document);
    }
}
class PrintThread extends Thread{
    Printer p;
    String document;
    int page_no;
    public PrintThread(Printer p,String document,int page_no){
        this.p=p;
        this.document=document;
        this.page_no=page_no;
    }
    public void run(){
        p.print(document,page_no);
    }
}
class P31{
    public static void main(String args[]){
        Printer p=new Printer();
        PrintThread t1=new PrintThread(p,"DOCUMENT 1",2);
        PrintThread t2=new PrintThread(p,"DOCUMENT 2",5);
        PrintThread t3=new PrintThread(p,"DOCUMENT 3",2);
        t1.start();
        t2.start();
        t3.start();
    }
}