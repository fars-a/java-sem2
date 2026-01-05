import java.util.*;
import java.io.*;
class FRead{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		String fn;
		FileInputStream fin;
		int ch;
		System.out.println("Enter the file name: ");
		fn=s.nextLine();
		try{
			fin=new FileInputStream(fn);
			while(true){
				ch=fin.read();
				if(ch==-1)
					break;
				System.out.print((char)ch);
			}
			fin.close();
		}
		catch(Exception e){
			System.out.println("Error: "+e);
		}
}
}