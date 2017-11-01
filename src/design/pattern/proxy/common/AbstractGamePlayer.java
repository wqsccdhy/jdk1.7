package design.pattern.proxy.common;

public abstract class AbstractGamePlayer implements IGamePlayer {

	public abstract void login();

	public abstract void killBoss();

	public abstract void upgrade();

	public AbstractGamePlayer getProxy() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void doService() {
		this.login();
		this.killBoss();
		this.upgrade();

	}
	
	@Override
	public void doService(String value) {
		System.out.println(value);
		this.login();
		this.killBoss();
		this.upgrade();
		
	}

}
