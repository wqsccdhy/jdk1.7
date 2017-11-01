package design.pattern.composite.demo;

import java.util.ArrayList;
import java.util.List;

public class Branch extends AbsGroup implements IBranch {

	private List<AbsGroup> absGroups = new ArrayList<AbsGroup>();

	public Branch(String name, String position) {
		super(name, position);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addSubordinate(AbsGroup group) {
		group.setParentGroup(this);
		this.absGroups.add(group);

	}

	@Override
	public List<AbsGroup> getSubordinate() {
		return this.absGroups;

	}

	@Override
	public String getGroupType() {
		// TODO Auto-generated method stub
		return "Branch";
	}

}
