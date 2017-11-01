package design.pattern.proxy.force;

import design.pattern.proxy.common.AbstractGamePlayer;

public class ForceGamerPlayer extends AbstractGamePlayer {

	private String name;

	private AbstractGamePlayer proxy;

	public ForceGamerPlayer(String name) {
		super();
		this.name = name;
	}

	@Override
	public void login() {
		if (isProxy()) {
			System.out.println(this.name + "登陆...");
		} else {
			System.out.println(this.name + "请使用指定代理登陆...");
		}

	}

	@Override
	public void killBoss() {
		if (isProxy()) {
			System.out.println(this.name + "打怪...");
		} else {
			System.out.println(this.name + "请使用指定代理打怪...");
		}

	}

	@Override
	public void upgrade() {

		if (isProxy()) {
			System.out.println(this.name + "升级...");
		} else {
			System.out.println(this.name + "请使用指定代理升级...");
		}

	}

	public AbstractGamePlayer getProxy() {
		proxy = new ForceProxy(this);
		return proxy;
	}

	private boolean isProxy() {
		if (proxy == null) {
			return false;
		} else {
			return true;
		}
	}

}
