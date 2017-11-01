package design.pattern.adapter.definition;

public class AdapterTest {

	public static void main(String[] args) {
		Target target = new TargetImpl();
		target.request();
		System.out.println("-----------------");
		Target target1 = new Adapter();
		target1.request();
	}

}
