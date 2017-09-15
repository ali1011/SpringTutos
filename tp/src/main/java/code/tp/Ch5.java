package code.tp;

import java.io.Closeable;
import java.io.IOException;

public class Ch5 {
	public static void main(String[] args) {
		
	}
	 void m()  {
		 try(Close a = new Close()){
			 
		 }catch(IOException | RuntimeException e) {
			 
		 }
	 }
	

}
class Close implements Closeable {
	
	@Override
	public void close() throws IOException {
		// TODO Auto-generated method stub
		
	}
	
	
}
