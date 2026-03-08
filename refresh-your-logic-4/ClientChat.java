import java.io.*;
import java.net.*;
class ClientChat{
    public static void main(String args[]){
        Socket cs;

        try{
            cs=new Socket("localhost",1234);
            DataInputStream kin=new DataInputStream(System.in);
            DataInputStream din=new DataInputStream(cs.getInputStream());
            DataOutputStream dout=new DataOutputStream(cs.getOutputStream());
            String str;
            while(true){
                str=din.readUTF();
                if(str.equals("quit"))
                    break;
                System.out.println("server: "+str);
                System.out.println("Enter data/quit: ");
                str=kin.readLine();
                if(str.equals("quit"))
                    break;
                dout.writeUTF(str);
            }
        }
        catch(Exception e){}
    }
}