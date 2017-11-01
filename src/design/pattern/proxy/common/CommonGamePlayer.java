package design.pattern.proxy.common;

public class CommonGamePlayer extends AbstractGamePlayer {

	private String name;

	public CommonGamePlayer(String name) {
		super();
		this.name = name;
	}

	@Override
	public void login() {
		System.out.println(this.name + "登陆...");

	}

	@Override
	public void killBoss() {
		System.out.println(this.name + "打怪...");

	}

	@Override
	public void upgrade() {
		System.out.println(this.name + "升级...");

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
