package design.pattern.proxy.force;

import design.pattern.proxy.common.AbstractGamePlayer;

public class ForceProxy extends AbstractGamePlayer {

	private AbstractGamePlayer realPlayer;

	public ForceProxy(AbstractGamePlayer realPlayer) {
		super();
		this.realPlayer = realPlayer;
	}

	@Override
	public void login() {
		this.realPlayer.login();

	}

	@Override
	public void killBoss() {
		this.realPlayer.killBoss();

	}

	@Override
	public void upgrade() {
		this.realPlayer.upgrade();

	}

}
