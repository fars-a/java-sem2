import java.io.*;
import java.net.*;
class TCPClient{
    public static void main(String args[]){
        Socket cs;
        try{
            cs=new Socket("localhost",1234);
            System.out.println("connected to server...");
            DataInputStream din=new DataInputStream(cs.getInputStream());
            DataOutputStream dout=new DataOutputStream(cs.getOutputStream());
            String str=din.readUTF();
            System.out.println("server: "+str);
            dout.writeUTF("server alle");
        }
        catch(Exception e){}
    }
}