package design.pattern.adapter.definition;

/**
 * 适配器，将源角色转换为目标角色
 * 
 * @author Administrator
 *
 */
public class Adapter extends Adaptee implements Target {

	@Override
	public void request() {
		super.doSomethong();

	}

}
