import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class LogTest {

	public static void main(String[] args) {

		final Semaphore semaphore = new Semaphore(1);

		final BlockingQueue<String> queue = new ArrayBlockingQueue<String>(10);

		ExecutorService executorService = Executors.newFixedThreadPool(4);

		for (int i = 0; i < 10; i++) {
			executorService.submit(new Runnable() {
				@Override
				public void run() {

					try {
						semaphore.acquire();
						String take = queue.take();
						printLog(take);

					} catch (Exception e) {
						e.printStackTrace();
					} finally {
						semaphore.release();
					}

				}
			});
		}

		for (int i = 0; i < 10; i++) {
			final String log = "" + (i + 1);

			try {
				queue.put(log);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		executorService.shutdown();

	}

	public static void printLog(String log) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + ":--" + log + ":" + (System.currentTimeMillis()));
	}

}
