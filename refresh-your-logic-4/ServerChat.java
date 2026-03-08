import java.io.*;
import java.net.*;
class ServerChat{
    public static void main(String args[]){
        ServerSocket ss;
        Socket as;
        String str;
        try{
            ss=new ServerSocket(1234);
            System.out.println("server listening on port no:1234");
            as=ss.accept();
            DataInputStream din=new DataInputStream(as.getInputStream());
            DataOutputStream dout=new DataOutputStream(as.getOutputStream());
            DataInputStream kin=new DataInputStream(System.in);
            dout.writeUTF("hello");
            while(true){
                str=din.readUTF();
                if(str.equals("quit"))
                    break;
                System.out.println("client: "+str);
                System.out.println("Enter data/quit");
                str=kin.readLine();
                dout.writeUTF(str);
            }
        }
        catch(Exception e){}
    }
}