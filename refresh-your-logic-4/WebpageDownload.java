import java.util.*;
import java.net.*;
import java.io.*;
class WebpageDownload{
    public static void main(String args[]) throws Exception{
        Scanner s=new Scanner(System.in);
        System.out.println("URL: ");
        String str=s.nextLine();
        URL url=new URL(str);
        BufferedReader reader=new BufferedReader(new InputStreamReader(url.openStream()));
        BufferedWriter writer=new BufferedWriter(new FileWriter("a.html"));
        String line;
        while((line=reader.readLine())!=null){
            writer.write(line);
            writer.newLine();
        }
    }
}