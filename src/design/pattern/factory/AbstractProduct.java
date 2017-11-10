package design.pattern.factory;
/**
 * 
 * @author Administrator
 *
 */
public abstract class AbstractProduct implements IProduct {

	@Override
	public void method1() {
		System.out.println("method1业务逻辑处理");

	}

	@Override
	public abstract void method2();

}
