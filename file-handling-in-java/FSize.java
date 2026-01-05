//write a program to display the size of a given file

import java.io.*;
import java.util.*;
class FSize{
	public static void main(String args[]){
	Scanner s=new Scanner(System.in);
		String fn;
		FileInputStream fin;
		int ch;
		int size=0;
		System.out.println("Enter the file name: ");
		fn=s.nextLine();
		try{
			fin=new FileInputStream(fn);
			while(true){
				ch=fin.read();
				if(ch==-1)
					break;
				size++;
			}
			System.out.println("size: "+size);
			fin.close();
		}
		catch(Exception e){
			System.out.println("Error: "+e);
		}
	
	}
}