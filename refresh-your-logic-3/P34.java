import java.util.*;
class PriorityThread extends Thread{
    String threadName;
    public PriorityThread(String threadName){
        this.threadName=threadName;
    }
    public void run(){
            System.out.println(threadName+" running" + " with Priority: "+getPriority());
        }
}
class P34{
    public static void main(String args[]){
        PriorityThread highPriorityThread=new PriorityThread("High Priority Thread");
        PriorityThread lowPriorityThread=new PriorityThread("Low Priority Thread");
        PriorityThread normPriorityThread=new PriorityThread("Normal Priority Thread");
        highPriorityThread.setPriority(Thread.MAX_PRIORITY);
        lowPriorityThread.setPriority(Thread.MIN_PRIORITY);
        normPriorityThread.setPriority(Thread.NORM_PRIORITY);
        highPriorityThread.start();
        lowPriorityThread.start();
        normPriorityThread.start();
    }
}