import java.net.*;
import java.io.*;
import java.util.*;
class WebpageContent{
    public static void main(String args[]) throws Exception{
        Scanner s=new Scanner(System.in);
        System.out.println("URL: ");
        String str=s.nextLine();
        URL url=new URL(str);
        BufferedReader bf=new BufferedReader(new InputStreamReader(url.openStream()));
        String line;
        while((line=bf.readLine())!=null){
            System.out.println(line);
        }
        s.close();
    }
}