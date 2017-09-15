package code.tp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Ch3 {
	
	public static void main(String[] args) {
		 Comparator<Rc> comp = Comparator.comparing(a1->a1.i) ;
		 comp = comp.thenComparing(a1->a1.c) ;
		
		 List<Rc> l = new ArrayList<>() ;
		 Collections.sort(l,comp);
		
		 List<R> lr = new ArrayList<>() ;
		 Comparator<R> com = (a,b)->a.r-b.r ;
		 
		 Collections.sort(lr,com);
		 Collections.binarySearch(lr, new R(4), com) ;
		 Set<R> set = new TreeSet<>(com);
		 set.add(new R(10)) ;
		 
		 Consumer<List<Rc>> con = Collections::sort ;
		 String s = "abc" ;
		
		 Predicate<String> p = s::startsWith ;
		 Supplier sup = ArrayList::new ;
		 lr.forEach(System.out::println);
		 
	} 
	
	
}

 class R {
	 int r ;
	 public R(int r) {
		this.r = r;
	}
 }
 class Rc implements Comparable<Rc>{
	 int i ; String c ;
	public int compareTo(Rc b) {
		return this.i -b.i  ;
	}
 }

  
