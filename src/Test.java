import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class Test {

	public static void main(String[] args) {
		String name = Apple.class.getSimpleName();
		System.out.println(name);
		
		Object object = new Object();
		String string = new String("111");
		
		ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<String, String>();
		String put = concurrentHashMap.put("1", "sss");
		String put2 = concurrentHashMap.put("1", "xxx");
		concurrentHashMap.get("1");
		System.out.println(put);
		System.out.println(put2);
		
		
		List<Apple> apples = new ArrayList<Apple>();
		Apple apple1 = new Apple("��ɫ");
		Apple apple2 = new Apple("��ɫ");
		Apple apple3 = new Apple("��ɫ");
		
		apples.add(apple1);
		apples.add(apple2);
		apples.add(apple3);
		
		Iterator<Apple> iterator = apples.iterator();
		while (iterator.hasNext()) {
			Apple next = iterator.next();
			if ("��ɫ".equals(next.getColor())) {
				iterator.remove();
			}else {
				System.out.println(next.getColor());
			}
		}

	}

}
