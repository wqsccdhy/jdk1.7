package test.barrier;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
 * 
 * @author Administrator
 * CyclicBarrier初始化时规定一个数目，然后计算调用了CyclicBarrier.await()进入等待的线程数。当线程数达到了这个数目时，所有进入等待状态的线程被唤醒并继续。 
   CyclicBarrier就象它名字的意思一样，可看成是个障碍， 所有的线程必须到齐后才能一起通过这个障碍。 
   CyclicBarrier初始时还可带一个Runnable的参数， 此Runnable任务在CyclicBarrier的数目达到后，所有其它线程被唤醒前被执行。
   
   CyclicBarrier可以重用，CountDownLatch不可以重用
 *
 */
public class TestCyclicBarrier {

	private static final int THREAD_NUM = 5;

	public static class WorkerThread implements Runnable {

		CyclicBarrier barrier;

		public WorkerThread(CyclicBarrier b) {
			this.barrier = b;
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			try {
				long id = Thread.currentThread().getId();
				System.out.println(id + " Worker's waiting");
				// 线程在这里等待，直到所有线程都到达barrier。
				barrier.await();
				System.out.println("ID:" + id
						+ " Working");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	/**
	 * @param args
	 */	
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(THREAD_NUM);
		
		// TODO Auto-generated method stub
		CyclicBarrier cb = new CyclicBarrier(THREAD_NUM, new Runnable() {
			// 当所有线程到达barrier时执行
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Inside Barrier:开始执行任务");

			}
		});

		for (int i = 0; i < THREAD_NUM; i++) {
			executorService.submit(new WorkerThread(cb));
		}
		
		executorService.shutdown();
	}

}
