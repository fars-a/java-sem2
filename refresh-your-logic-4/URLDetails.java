import java.net.*;
import java.util.*;
class URLDetails{
    public static void main(String args[]) throws Exception{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter URL: ");
    String str=sc.nextLine();
    URL url=new URL(str);
    System.out.println("URL details");
    System.out.println("Protocol: "+ url.getProtocol());
    System.out.println("Port: "+ url.getPort());
    System.out.println("Host: "+ url.getHost());
    System.out.println("Path: "+ url.getPath());
    }
}