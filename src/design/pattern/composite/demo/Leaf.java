package design.pattern.composite.demo;

public class Leaf extends AbsGroup {

	public Leaf(String name, String position) {
		super(name, position);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getGroupType() {
		return "Leaf";
	}

}
