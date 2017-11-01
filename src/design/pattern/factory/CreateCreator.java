package design.pattern.factory;

public class CreateCreator extends Creator {

	@Override
	public <T extends Product> T createProduct(Class<T> c) {
		Product product = null;
		if (c != null) {
			try {
				product = (Product) Class.forName(c.getName()).newInstance();
			} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return (T) product;

	}

}
