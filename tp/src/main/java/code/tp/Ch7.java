package code.tp;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.Future;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.RecursiveTask;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Ch7 {
	
	public static void main(String[] args) {
		Balance.process() ;
		ExecutorService e = Executors.newSingleThreadExecutor() ;
		
		ScheduledExecutorService es = Executors.newSingleThreadScheduledExecutor();
		try {
		  es.schedule(()->1, 10, TimeUnit.SECONDS) ;
			Future<?>  f = e.submit(()-> {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			});
			try {
				f.get() ;
			} catch (InterruptedException | ExecutionException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}finally {
			if(e != null) e.shutdown();
		}
	}
	
	static class T extends Thread {
		int i = 1;
		public void run() {
			System.out.println(i);
		}
	}
	
	static  void m() {
		synchronized(Ch7.class) {
			AtomicInteger ai = new AtomicInteger(10)  ;
			int i = ai.incrementAndGet() ;
		}
	}
	
	void collection() {
		Map<String,String> cmap = new ConcurrentHashMap<>();
		Set<String> cset = new ConcurrentSkipListSet<>();
		List<String> list = new CopyOnWriteArrayList<>();
		Collections.synchronizedList(list) ;
	}
	
	void parallelStream() {
		List<Integer> li = Arrays.asList(1,2,3,4,5,6) ;
		li.parallelStream().map(i->i*2).filter(i->(i==6)).collect(Collectors.toCollection(TreeSet::new)) ;
		
	}
	
	void process(CyclicBarrier c1,CyclicBarrier c2 ) throws InterruptedException, BrokenBarrierException {
		System.out.println("T1");
		c1.await() ;
		System.out.println("T2");
		c2.await() ;
		System.out.println("T3");
	}

	static class Balance extends RecursiveTask<Integer> {
		int[] W  ;
		int start ;
		int end;
		public Balance(int start , int end) {
			this.start = start;
			this.end = end;
		}
		protected Integer compute() {
			if(end-start<=3) {
				int sum =0;
				for (int i = start; i <= end; i++) {
					W[i] = ThreadLocalRandom.current().nextInt(10, 30) ;
					sum = sum + W[i] ;
				}
				return sum;
			}else {
				int mid = start + (start-end)/2 ;
				RecursiveTask<Integer> T1 = new Balance(start, mid);
				
				
				return new Balance(mid, end).compute() + T1.join() ;
			}
		
			
		}
		
		static int process() {
			ForkJoinTask<Integer> T = new Balance(1, 10) ;
			ForkJoinPool pool = new ForkJoinPool(3) ;
			return pool.invoke(T) ;
			
		}
		
	}

}
