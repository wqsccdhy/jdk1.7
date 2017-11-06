package design.pattern.visitor.demo;

public class TotalVisitorImpl implements ITotalVisitor {

	private int commonTotalSalary = 0;

	private int managerTotalSalary = 0;

	@Override
	public void visit(Manager manager) {
		calManagerTotalSalary(manager.getSalarey());

	}

	@Override
	public void visit(CommonEmployee commonEmployee) {
		calCommonTotalSalary(commonEmployee.getSalarey());
	}

	@Override
	public int getAllSalary() {
		return commonTotalSalary + managerTotalSalary;
	}

	private void calManagerTotalSalary(int salary) {
		this.managerTotalSalary += salary;
	}

	private void calCommonTotalSalary(int salary) {
		this.commonTotalSalary += salary;
	}

}
