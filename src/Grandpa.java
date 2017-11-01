
public class Grandpa {
	{
		System.out.println("执行Grandpa的普通块");
	}
	static {
		System.out.println("执行Grandpa的静态快");
	}

	public Grandpa() {
		System.out.println("执行Grandpa的构造方法");
	}

	static {
		System.out.println("执行Grandpa的静态快222222");
	}
	{
		System.out.println("执行Grandpa的普通快222222");
	}
}