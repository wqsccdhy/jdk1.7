package design.pattern.factory;

public class CreateCreator extends Creator {

	@Override
	public <T extends IProduct> T createProduct(Class<T> c) {
		IProduct product = null;
		if (c != null) {
			try {
				product = (IProduct) Class.forName(c.getName()).newInstance();
			} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return (T) product;

	}

}
