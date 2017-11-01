package design.pattern.composite.demo;

public abstract class AbsGroup implements IGroup {

	private String name;

	private String position;

	//父节点
	private AbsGroup parentGroup = null;

	public AbsGroup(String name, String position) {
		super();
		this.name = name;
		this.position = position;
	}

	@Override
	public void getInfo() {
		System.out.println("姓名：" + this.name + " 职位:" + this.position);

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public AbsGroup getParentGroup() {
		return parentGroup;
	}

	public void setParentGroup(AbsGroup parentGroup) {
		this.parentGroup = parentGroup;
	}

}
