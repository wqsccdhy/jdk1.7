package design.pattern.factory;

public abstract class Creator {

	public abstract <T extends IProduct> T createProduct(Class<T> c); 
}
