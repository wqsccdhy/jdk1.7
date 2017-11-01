public class Person {

	private static String COUNTRY = "China";
	
	{
		System.out.println("1");
	}
	
	
	{
		System.out.println("2");
	}
	
	static   {
		System.out.println("3");
	}
	
	static   {
		System.out.println("4");
	}
	
	public Person() {
		super();
		System.out.println("构造方法没有参数");
	}

	public Person(String name, int age) {
		super();
		System.out.println("构造方法");
		this.name = name;
		this.age = age;
	}

	private String name;

	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void showInfo() {
		System.out.println(this.name + "  " + COUNTRY);
	}
	
	{
		System.out.println("5");
	}
	
	static   {
		System.out.println("6");
	}
	

	public static void main(String[] args) {
		Person person = new Person("wq", 10);
	}
	
}
