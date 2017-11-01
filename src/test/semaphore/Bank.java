package test.semaphore;

/**
 * 银行存钱类
 */
public class Bank {
	private int account = 100;

	public int getAccount() {
		return account;
	}

	public void save(int money) {
		account += money;
	}
}
