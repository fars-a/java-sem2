import java.net.*;
import java.io.*;
class ReadThread implements Runnable {
    private DataInputStream in;

    public ReadThread(DataInputStream in) {
        this.in = in;
    }

    public void run() {
        try {
            while (true) {
                System.out.println(in.readUTF());
            }
        } catch (Exception e) {
        }
    }
}
class GClient{
	public static void main(String args[]){
		try{
			Socket cs =new Socket("localhost",1234);
			DataInputStream sin;
			DataOutputStream sout;
			sin = new DataInputStream(cs.getInputStream());
			sout = new DataOutputStream(cs.getOutputStream());
			Thread readThread = new Thread(new ReadThread(sin));
            		readThread.start();
			BufferedReader kin = new BufferedReader(new InputStreamReader(System.in));
			for(;;){
				String str = kin.readLine();
				System.out.println("Enter data / quit");
				sout.writeUTF(str);
				if(str.equals("quit"))
					break;
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}