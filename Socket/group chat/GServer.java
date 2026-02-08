import java.io.*;
import java.net.*;
import java.util.concurrent.CopyOnWriteArrayList;

class MultClient extends Thread {
    Socket as;
    DataInputStream sin;
    DataOutputStream sout;

    static CopyOnWriteArrayList<DataOutputStream> clientList = new CopyOnWriteArrayList<>();

    public MultClient(Socket s) throws Exception {
        as = s;
        sin = new DataInputStream(as.getInputStream());
        sout = new DataOutputStream(as.getOutputStream());
        clientList.add(sout);
    }

    public void run() {
        try {
            String str;
            for (;;) {
                str = sin.readUTF();
                if (str.equals("quit")) {
                    clientList.remove(sout);
                    as.close();
                    break;
                }

                System.out.println("From Client: " + str);

                // Broadcast to all clients (excluding sender)
                for (DataOutputStream dout : clientList) {
                    if (dout != sout) {
                        dout.writeUTF("Message: " + str);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class GServer {
    public static void main(String args[]) {
        try {
            ServerSocket ss = new ServerSocket(1234);
            System.out.println("Server Started...");

            for (;;) {
                System.out.println("Server Waiting...");
                Socket as = ss.accept();
                System.out.println("Client connected");
                MultClient obj = new MultClient(as);
                obj.start();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
