package code.tp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Console;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class Ch8 {
	
	public static void main(String[] args) throws IOException {
		console();
	}
	
	void copy(String src , String dst) throws FileNotFoundException, IOException{
		try(BufferedReader reader = new BufferedReader(new FileReader(new File(src))) ;
				BufferedWriter writer = new BufferedWriter(new FileWriter(new File(dst)))	){
			
			String l ;
			while((l =reader.readLine())!=null) {
				writer.write(l);
				writer.newLine();
				
			}
			
		}
	}
     
	static void console() throws IOException {
	

		Console c = System.console() ;
		if(c==null) System.out.println("c is null");
		if(c!=null) {
			String s = c.readLine("enter ur name") ;
			
			c.flush();
			c.format("ur pass is : " + s) ;
		}
	}
}
