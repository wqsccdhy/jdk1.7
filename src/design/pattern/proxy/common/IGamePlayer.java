package design.pattern.proxy.common;

public interface IGamePlayer {

	void doService();
	
	void doService(String value);
	
	AbstractGamePlayer getProxy();
}
