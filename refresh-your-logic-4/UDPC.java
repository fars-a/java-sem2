import java.net.*;
import java.util.Scanner;
public class UDPC {
    public static void main(String args[]) {
        try {
        Scanner sc = new Scanner(System.in);
        DatagramSocket ds = new DatagramSocket();
        System.out.println("Enter the message: ");
        String message = sc.nextLine();
        byte[] send = message.getBytes();
        InetAddress ip = InetAddress.getByName("localhost");
        DatagramPacket dp = new DatagramPacket(send, send.length, ip, 1234);
        ds.send(dp);
        ds.close();
        }
        catch(Exception e) {}
    }
}