package design.pattern.visitor.difinition;

import java.util.Random;

public class ObjStruture {

	public static Element createData() {
		Random random = new Random();
		int nextInt = random.nextInt(100);
		if (nextInt > 50) {
			return new ElementImplA();
		} else {
			return new ElementImplB();
		}
	}

}
