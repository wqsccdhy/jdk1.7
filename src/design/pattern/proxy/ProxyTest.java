package design.pattern.proxy;

public class ProxyTest {

	public static void main(String[] args) {
		Subject realSubjet = new RealSubject();

		Subject proxy = new Proxy(realSubjet);

		proxy.request();
	}

}
