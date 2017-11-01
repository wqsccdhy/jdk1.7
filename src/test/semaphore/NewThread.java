package test.semaphore;

import java.util.concurrent.Semaphore;

public class NewThread implements Runnable {
	private Bank bank;
	private Semaphore semaphore;
	private static int a = 0;

	public NewThread(Bank bank, Semaphore semaphore) {
		this.bank = bank;
		this.semaphore = semaphore;
	}

	@Override
	public void run() {
		int b = a++;
		// 用来获取当前可用的资源数量
		if (semaphore.availablePermits() > 0) {
			System.out.println("线程" + b + "启动，进入银行,有位置立即去存钱");
		} else {
			System.out.println("线程" + b + "启动，进入银行,无位置，去排队等待等待");
		}
		try {
			// 用来申请资源
			semaphore.acquire();
			bank.save(10);
			System.out.println(b + "账户余额为：" + bank.getAccount());
			Thread.sleep(1000);
			System.out.println("线程" + b + "存钱完毕，离开银行");

		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			// 用来释放资源
			semaphore.release();
		}

	}

}
