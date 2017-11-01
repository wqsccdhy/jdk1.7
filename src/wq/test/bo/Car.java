package wq.test.bo;

public class Car {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		System.out.println("---" + Car.class);
		
		String className = Car.class.getName();
		System.out.println(className);

		try {
			Class<?> forName = Class.forName(className);
			Car car1 = (Car) forName.newInstance();
			car1.setName("s");
			String name2 = car1.getName();
			System.out.println(name2);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
