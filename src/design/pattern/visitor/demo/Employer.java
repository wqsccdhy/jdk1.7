package design.pattern.visitor.demo;

public abstract class Employer implements IEmployer {

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

	@Override
	public String getInfo() {
		String info = this.getBaseInfo() + this.getSelfInfo();
		return info;
	}

	@Override
	public String getBaseInfo() {
		String info = "姓名:" + this.name + "\t";
		info = info + "性别:" + this.sex + "\t";
		info = info + "薪水:" + this.salarey + "\t\t";
		return info;
	}

	public abstract void accept(IVistor vistor);

}
