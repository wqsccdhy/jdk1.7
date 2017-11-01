package test.thread.threadlocal;

import java.util.concurrent.CountDownLatch;

public class Thread1 implements Runnable {

	private ShareData data;

	CountDownLatch beginLatch;

	CountDownLatch endLatch;

	public Thread1(ShareData data, CountDownLatch beginLatch,
			CountDownLatch endLatch) {
		this.data = data;
		this.beginLatch = beginLatch;
		this.endLatch = endLatch;
	}

	@Override
	public void run() {
		try {
			beginLatch.await();
			for (int i = 0; i < 5; i++) {
				this.data.inc();
			}
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			endLatch.countDown();
		}

	}

}
