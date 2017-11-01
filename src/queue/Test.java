package queue;

import java.io.File;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		//arrayBlockingQueueTest();
		
		//linkedBlockingQueueTest();
		
		priorityBlockingQueueTest();
		
		//modify();
		
	}
	
	public static void priorityBlockingQueueTest() throws InterruptedException{
		PriorityBlockingQueue<String> queue = new PriorityBlockingQueue<>(4);
		queue.add("1");
		queue.put("2");
		queue.offer("3");
		queue.offer("4");
		queue.offer("5");
	}

	public static void arrayBlockingQueueTest() throws InterruptedException {
		ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<String>(5);
		//queue.add(null);
		queue.add("1");
		queue.add("2");
		queue.add("3");
		queue.add("4");
		boolean add = queue.add("5");
		System.out.println(add);
		
		boolean offer = queue.offer("6");
		System.out.println(offer);
		int size = queue.size();
		System.out.println(size);
		
		queue.take();
	}
	
	public static void linkedBlockingQueueTest() throws InterruptedException{
		LinkedBlockingQueue<String> queue = new LinkedBlockingQueue<>(4);
		queue.add("1");
		queue.put("2");
		queue.offer("3");
		String poll = queue.poll();
		
		String take = queue.take();
		
		System.out.println(poll);
		System.out.println(take);
	}

	/**
	 * 修改文件后缀名
	 */
	private static void modify() {
		String pathname = "G:\\贵州\\各县市公文丢失\\oa-qdnzgxs_logs_20170920-010235-logs\\ApacheJetspeed\\logs_sy\\gccp\\2017-09-18";
		File file = new File(pathname);
		File[] listFiles = file.listFiles();
		for (File file2 : listFiles) {
			File fileNew = new File(pathname + "\\txt\\" + file2.getName() + ".txt");
			boolean renameTo = file2.renameTo(fileNew);
			System.out.println(renameTo);
		}
		//System.out.println(listFiles.length);
		
	}

}
