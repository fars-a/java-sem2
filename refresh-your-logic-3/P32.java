import java.io.*;
class ProducerConsumer{
    int data;
    boolean available=false;
    public synchronized void produce(int a){
        try{
            if(available){
                wait();
            }
            data=a;
            System.out.println("Produced: "+data);
            available=true;
            notifyAll();
        }
        catch(Exception e){
            System.out.println("Exception: "+e);
        }
    }
    public synchronized void consume(){
        try{
            if(!available){
                wait();
            }
            System.out.println("Consumed: "+data);
            available=false;
            notifyAll();
        }
        catch(Exception e){
            System.out.println("Exception: "+e);
        }
    }
}
class Producer extends Thread{
    ProducerConsumer pc;
    public Producer(ProducerConsumer pc){
        this.pc=pc;
    }
    public void run(){
        int i=1;
        while(true){
            pc.produce(i);
            i++;
        }
    }
}
class Consumer extends Thread{
    ProducerConsumer pc;
    public Consumer(ProducerConsumer pc){
        this.pc=pc;
    }
    public void run(){
        while(true){
            pc.consume();
        } 
    }
}
class ReaderWriter{
    int data;
    boolean available=false;
    public synchronized void write(int a){
        try{
            if(available){
                wait();
            }
            data=a;
            System.out.println("Write: "+data);
            available=true;
            notify();
        }
        catch(Exception e){
            System.out.println("Exception: "+e);
        }
    }
    public synchronized void read(){
        try{
            if(!available){
                wait();
            }
            System.out.println("Read: "+data);
            available=false;
            notify();
        }
        catch(Exception e){
            System.out.println("Exception: "+e);
        }
    }
}
class Reader extends Thread{
    ReaderWriter rw;
    public Reader(ReaderWriter rw){
        this.rw=rw;
    }
    public void run(){
        while(true){
            rw.read();
        }
    }
}
class Writer extends Thread{
    ReaderWriter rw;
    public Writer(ReaderWriter rw){
        this.rw=rw;
    }
    public void run(){
        int i=1;
        while(true){
            rw.write(i);
            i++;
        }
    }
}
class P32{
    public static void main(String args[]){
        ProducerConsumer pc=new ProducerConsumer();
        Producer p=new Producer(pc);
        Consumer c=new Consumer(pc);
        p.start();
        c.start();
        ReaderWriter rw=new ReaderWriter();
        Writer w=new Writer(rw);
        Reader r=new Reader(rw);
        w.start();
        r.start();
    }
}