package design.pattern.visitor.demo;

public abstract class Employer {
	
	private String name;
	
	private int sex;
	
	private int salarey;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public int getSalarey() {
		return salarey;
	}

	public void setSalarey(int salarey) {
		this.salarey = salarey;
	}
	
	public abstract void accept();

}
