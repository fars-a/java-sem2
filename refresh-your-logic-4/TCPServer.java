import java.io.*;
import java.net.*;
class TCPServer{
    public static void main(String args[]){
        ServerSocket ss;
        Socket as;
        try{
            ss=new ServerSocket(1234);
            System.out.println("serevr listening to port:1234");
            as=ss.accept();
            DataInputStream din=new DataInputStream(as.getInputStream());
            DataOutputStream dout=new DataOutputStream(as.getOutputStream());
            dout.writeUTF("hello from server");
            String str=din.readUTF();
            System.out.println("client: "+str);
            System.in.read();
        }
        catch(Exception e){
            System.out.println("error: "+e);
        }
    }
}