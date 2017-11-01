package design.pattern.proxy.common;

public class CommonProsyTest {

	public static void main(String[] args) {
		AbstractGamePlayer proxy = new CommonProxy("小李");
		proxy.doService();

	}

}
