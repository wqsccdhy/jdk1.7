package design.pattern.proxy.common;

public class CommonProxy extends AbstractGamePlayer {

	private String name;

	private AbstractGamePlayer gamePlayer = null;

	public CommonProxy(String name) {
		this.name = name;
		this.gamePlayer = new CommonGamePlayer(this.name);
	}

	@Override
	public void login() {
		this.gamePlayer.login();

	}

	@Override
	public void killBoss() {
		this.gamePlayer.killBoss();

	}

	@Override
	public void upgrade() {
		this.gamePlayer.killBoss();

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
