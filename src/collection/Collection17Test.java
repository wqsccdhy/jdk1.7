package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class Collection17Test {

	public static void main(String[] args) {
		//arrayListTest();
		ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<String, String>();
		concurrentHashMap.put("1", "a");
	}

	public static void arrayListTest() {
		List<String> arrayList = new ArrayList<String>(10);
		for (int i = 0; i < 11; i++) {
			arrayList.add("" + i);
		}
	}

	public static void linkedListTest() {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("1");
	}
	
	/*public static void linkedListTest() {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("1");
	}*/

}
