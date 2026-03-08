import java.net.*;
public class UDPS {
    public static void main(String args[]) {
        try {
        DatagramSocket ds = new DatagramSocket(1234);
        byte[] recieve = new byte[1024];
        DatagramPacket dp = new DatagramPacket(recieve, recieve.length);
        ds.receive(dp);
        String message = new String(dp.getData(), 0, dp.getLength());
        System.out.println("Client: " + message);
        ds.close();
        }
        catch(Exception e) {    
        }
    }
}