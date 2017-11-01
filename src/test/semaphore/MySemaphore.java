package test.semaphore;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 用ReentrantLock实现信号量Semaphore
 * 
 * @author Administrator
 *
 */
public class MySemaphore {

	final Lock lock = new ReentrantLock();

	final Condition condition = lock.newCondition();

	private int initialpermits;

	public MySemaphore(int initialpermits) {
		lock.lock();
		try {
			this.initialpermits = initialpermits;
		} finally {
			lock.unlock();
		}

	}

	public void acquire() throws InterruptedException {
		lock.lock();
		try {
			while (initialpermits <= 0) {
				condition.await();
			}
			--initialpermits;
		} finally {
			lock.unlock();
		}

	}

	public void release() {
		lock.lock();

		try {
			++initialpermits;
			condition.signal();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

}
