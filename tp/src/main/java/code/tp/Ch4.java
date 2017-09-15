package code.tp;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Ch4 {
		public static void main(String[] args) {
			mOptional();
		}
		void  mLambda(int i) {
		int c =0 ;
	    Predicate<Integer> p = a-> {  a = c;
	    							return true ; } ;
	    Predicate<String>  ps = String::isEmpty ;
	    Supplier<LocalDate> sd = LocalDate::now ;
	    BiConsumer<String,String>  con = (a,b)->a.concat(b) ;
	    Function<String,Integer> f = s->s.length();
	    
	}
	
		static Optional<Integer> mOptional() {
		Optional<Integer> op = Optional.ofNullable(10) ;
		op.ifPresent(System.out::println);
		if(op.isPresent()) op.get() ;
		return op ;
	}
	
		void m()  {
			int a = 1 ;
			assert a>0 ;
				
			try {
				throw new IOException() ;
			} catch (IOException | IllegalArgumentException e) {
				
			}finally {
				
			}
		}

		void n() throws Exception {
			try(Closed c= new Closed()){
				
			}
		}
	
   }
class Closed implements AutoCloseable {

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}
	
}
	
	

