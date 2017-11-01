package design.pattern.composite.demo;

import java.util.List;

public class CompositeTest {

	public static void main(String[] args) {

		Branch root = new Branch("CEO", "CEO");

		Branch kaiFaJL = new Branch("开发经理", "开发经理");

		Leaf mishu = new Leaf("秘书", "秘书");

		root.addSubordinate(mishu);
		root.addSubordinate(kaiFaJL);

		Branch kaiFaZZA = new Branch("开发组长A", "开发组长");
		Branch kaiFaZZB = new Branch("开发组长B", "开发组长");

		kaiFaJL.addSubordinate(kaiFaZZA);
		kaiFaJL.addSubordinate(kaiFaZZB);

		Leaf kaiFaRY1 = new Leaf("开发人员A1", "开发人员");
		Leaf kaiFaRY2 = new Leaf("开发人员A2", "开发人员");

		Leaf kaiFaRY3 = new Leaf("开发人员B1", "开发人员");
		Leaf kaiFaRY4 = new Leaf("开发人员B2", "开发人员");

		kaiFaZZA.addSubordinate(kaiFaRY1);
		kaiFaZZA.addSubordinate(kaiFaRY2);

		kaiFaZZB.addSubordinate(kaiFaRY3);
		kaiFaZZB.addSubordinate(kaiFaRY4);

		showChild(root);
		System.out.println("-----------------");
		showParent(mishu);

	}

	private static void showParent(AbsGroup group) {
		AbsGroup parentGroup = group.getParentGroup();
		if (parentGroup == null) {
			System.out.println(group.getName() + " 是root节点");
			return;
		}else {
			String content = group.getName() + "  上级节点是:";
			System.out.printf(content);
			parentGroup.getInfo();
			showParent(parentGroup);
		}
	}

	public static void showChild(AbsGroup group) {
		String groupType = group.getGroupType();
		group.getInfo();
		if ("Branch".equals(groupType)) {
			IBranch iBranch = (IBranch) group;
			List<AbsGroup> subordinate = iBranch.getSubordinate();
			for (AbsGroup absGroup : subordinate) {
				showChild(absGroup);
			}
		}

	}

}
