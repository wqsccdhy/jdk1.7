package design.pattern.visitor.demo;

public class VistorImpl implements IVistor {

	private int commonTotalSalary = 0;

	private int managerTotalSalary = 0;

	@Override
	public void visit(Manager manager) {
		String info = manager.getInfo();
		calManagerTotalSalary(manager.getSalarey());
		System.out.println(info);
	}

	@Override
	public void visit(CommonEmployee commonEmployee) {
		String info = commonEmployee.getInfo();
		calCommonTotalSalary(commonEmployee.getSalarey());
		System.out.println(info);

	}

	private void calManagerTotalSalary(int salary) {
		this.managerTotalSalary += salary;
	}

	private void calCommonTotalSalary(int salary) {
		this.commonTotalSalary += salary;
	}

	@Override
	public int getAllSalary() {
		return commonTotalSalary + managerTotalSalary;
	}

}
