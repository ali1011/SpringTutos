package code.tp;

import java.util.ArrayList;
import java.util.List;

import code.tp.Food.FoodBuilder;

public class Ch2 {
	public static void main(String[] args) {
		 Food d = new FoodBuilder().build();
		
		Token t = Token.getToken() ;
		int c = 0 ;
		
		I1 i = (s,n)->{  n = c ;
			 			return true ;} ;
			 			
	}
}

interface I<E> {
	E getTop(List<E> l) ;
}

class c<E> implements I<E> {

	@Override
public E getTop(List<E> l) {
		// TODO Auto-generated method stub
		return l==null || l.get(0)==null?null : l.get(0) ;
	}
	
}

@FunctionalInterface
interface I1{
	boolean m(String s, Integer i) ;
}

class A{
	int age ;
	B b ;
	void mA() {
		b.m();
	}
	int getAge() {
		return 1 ;
	}
	void setAge(int age) {
		if(age<0) throw new IllegalArgumentException()  ;
		this.age = age ;
	}
}
class B {
	void m() {
		
	}
}

//class Token {
//	 Token t ;
//	 Token(){
//		 
//	 }
//}


class Token {
	 private static  Token t;
	 static {
		 t = new Token() ;
	 }
	 private Token(){
		 
	 }
	 static  Token getToken(){
		 if(t==null) { synchronized(Token.class) {
			 if(t==null) t= new Token() ; }}
			 return t ;
		 
	 }
	 
}
   final class   Animal {
	private final List<String> foods ;
	public Animal(List<String> foods) {
		super();
		this.foods = new ArrayList<>(foods);
	}

	public List<String> getFoods() {
			return new ArrayList<>(foods);
		}

//		public void setFoods(List<String> foods) {
//			this.foods = foods;
//		}
	
}
   class Food {
	   int a,b,c,d ;

	public Food(int a, int b, int c, int d) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	 static class FoodBuilder{
		static Food f = new Food(1, 1, 1, 1) ;
	 Food setA(int i){
		 f.a=i;
		 return f ;
	 }
	 Food setB(int i){
		 f.b=i;
		 return f ;
	 }
	 Food setC(int i){
		 f.c=i;
		 return f ;
	 }
	 Food setD(int i){
		 f.d=i;
		 return f ;
	 }
	   static Food build() {
		return f ;
		   
	   }
   }
	 
	 
  }
