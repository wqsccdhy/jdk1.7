package design.pattern.proxy.dynamicagent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyAgentHandler implements InvocationHandler {

	private Object obj;

	public MyAgentHandler(Object obj) {
		super();
		this.obj = obj;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("代理1");
		method.invoke(this.obj, args);
		System.out.println("代理2");
		return null;
	}

}
