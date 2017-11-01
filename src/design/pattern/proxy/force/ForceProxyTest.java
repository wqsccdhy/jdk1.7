package design.pattern.proxy.force;

import java.lang.reflect.Proxy;

import design.pattern.proxy.common.AbstractGamePlayer;

public class ForceProxyTest {

	public static void main(String[] args) {
		AbstractGamePlayer player = new ForceGamerPlayer("小强");
		AbstractGamePlayer proxy = player.getProxy();
		proxy.doService();

	}

}
