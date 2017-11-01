
public class Child extends Parent {
    {
        System.out.println("执行Child的普通块");
    }
    static {
        System.out.println("执行Child的静态快");
    }
    public Child(){
        super(222);
        System.out.println("a = " + a);
        System.out.println("执行Child的构造方法");
    }
    static{
        System.out.println("执行Child的静态快222222");
    }
    {
        System.out.println("执行Child的普通快222222");
    }
    
    public static void main(String[] args) {
    	new Child();
	}
}