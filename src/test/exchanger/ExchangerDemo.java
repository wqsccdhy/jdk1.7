package test.exchanger;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Exchanger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Exchanger可以在两个线程之间交换数据，只能是2个线程，他不支持更多的线程之间互换数据
 * 
 * @author Administrator
 *
 */
public class ExchangerDemo {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newCachedThreadPool();
		Exchanger<List<Integer>> exchanger = new Exchanger<List<Integer>>();
		executorService.submit(new Producer(exchanger));
		executorService.submit(new Consumer(exchanger));
		executorService.shutdown();

	}

}

class Producer implements Runnable {

	List<Integer> list = new ArrayList<Integer>(10);
	Exchanger<List<Integer>> exchanger = null;

	public Producer(Exchanger<List<Integer>> exchanger) {
		super();
		this.exchanger = exchanger;
	}

	@Override
	public void run() {
		Random rand = new Random();
		for (int i = 0; i < 10; i++) {
			list.clear();
			list.add(rand.nextInt(10000));
			list.add(rand.nextInt(10000));
			list.add(rand.nextInt(10000));
			list.add(rand.nextInt(10000));
			list.add(rand.nextInt(10000));
			System.out.println("Producer Before:" + list.get(0) + ", ");
			System.out.println("Producer Before:" + list.get(1) + ", ");
			System.out.println("Producer Before:" + list.get(2) + ", ");
			System.out.println("Producer Before:" + list.get(3) + ", ");
			System.out.println("Producer Before:" + list.get(4) + ", ");
			try {
				list = exchanger.exchange(list);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Producer After:" + list.get(0) + ", ");
			System.out.println("Producer After:" + list.get(1) + ", ");
			System.out.println("Producer After:" + list.get(2) + ", ");
			System.out.println("Producer After:" + list.get(3) + ", ");
			System.out.println("Producer After:" + list.get(4) + ", ");
		}
	}
}

class Consumer implements Runnable {
	List<Integer> list = new ArrayList<Integer>(10);
	Exchanger<List<Integer>> exchanger = null;

	public Consumer(Exchanger<List<Integer>> exchanger) {
		super();
		this.exchanger = exchanger;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			list.add(100);
		}
		for (int i = 0; i < 10; i++) {
			try {
				list = exchanger.exchange(list);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			/*System.out.println("Consumer:" + list.get(0) + ", ");
			System.out.println("Consumer:" + list.get(1) + ", ");
			System.out.println("Consumer:" + list.get(2) + ", ");
			System.out.println("Consumer:" + list.get(3) + ", ");
			System.out.println("Consumer:" + list.get(4) + ", ");*/
		}

	}

}
