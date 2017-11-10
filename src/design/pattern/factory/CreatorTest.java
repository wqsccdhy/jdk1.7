package design.pattern.factory;

public class CreatorTest {

	public static void main(String[] args) {
		Creator creator = new CreateCreator();
		AbstractProduct createProduct = creator.createProduct(ProductImpl.class);
		createProduct.method1();
		createProduct.method2();
	}

}
