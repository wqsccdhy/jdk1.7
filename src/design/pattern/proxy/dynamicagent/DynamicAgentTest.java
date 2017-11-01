package design.pattern.proxy.dynamicagent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import design.pattern.proxy.common.CommonGamePlayer;
import design.pattern.proxy.common.IGamePlayer;

public class DynamicAgentTest {

	public static void main(String[] args) {
		IGamePlayer gamePlayer = new CommonGamePlayer("测试人员");

		InvocationHandler handler = new MyAgentHandler(gamePlayer);

		ClassLoader classLoader = gamePlayer.getClass().getClassLoader();
		
		Class<? extends IGamePlayer> class1 = gamePlayer.getClass();
		Class<?> superclass = class1.getSuperclass();
		Class<?>[] interfaces = superclass.getInterfaces();

		Object proxyInstance = Proxy.newProxyInstance(classLoader, interfaces, handler);

		IGamePlayer proxy = (IGamePlayer) proxyInstance;

		proxy.doService("测试");

	}

}
