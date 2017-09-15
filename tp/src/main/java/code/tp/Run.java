package code.tp;

import java.util.Comparator;

public class Run {
	
	public static void main(String[] args) {
		Run.A a = new Run.A() ;
		Run.B b = new Run().new B();
	}
	int rank ;
	
	void m() {
	}
	
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return rank;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(!(obj instanceof Run)) return false ;
		Run r = (Run) obj ;
		return r.equals(obj);
	}
	
	 enum Season {
		W , S , Su , A  ;
		public String s ;
		private Season(){
			
		}
		public void m() {
			
		}
	}
	
	 void n() {
		   Season s = Season.A  ;
		 switch(s) {
		 case A : ;
		 case S : ;
		 case W : ;
		 }
		 class C {
			 int cc = rank;
			 Season c = s ;
		 }
		 
		 Comparator<Integer> com = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1-o2;
			}
			 
		};
	 }
	private class B{
		int b = rank;
	}
	public  static class A {
		 int a = new Run().rank ;
	 }
	

}
