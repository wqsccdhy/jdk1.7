package design.pattern.template;

/**
 * 抽象模板 
 * 方法分为3类：
 *  1：基本方法(如：doSomething和doAnything) 
 *  2：模板方法(对基本方法进行调用) 
 *  3:钩子函数()
 * 
 * String中用到的模板方法模式
 * http://blog.csdn.net/z69183787/article/details/65628166
 * @author Administrator
 *
 */
public abstract class AbstractClass implements ITemplate{

	protected abstract void doSomething();

	protected abstract void doAnything();

	protected boolean isFlag() {
		return true;
	}

	@Override
	public void templateMethod() {
		this.doAnything();
		if (isFlag()) {
			this.doSomething();
		}

	}

}
