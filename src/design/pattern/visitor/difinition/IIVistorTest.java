package design.pattern.visitor.difinition;

public class IIVistorTest {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Element createData = ObjStruture.createData();
			createData.accept(new IIVistorImpl());
		}

	}

}
