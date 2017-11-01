package test.thread.threadlocal;

public class ShareData {

	private int j;

	public synchronized void inc() {
		j++;
		System.out.println(Thread.currentThread().getName() + "---inc---" + j);
	}

	public synchronized void dec() {
		j--;
		System.out.println(Thread.currentThread().getName() + "===dec===" + j);
	}

	public int getJ() {
		return j;
	}

}
