package design.pattern.visitor.demo;

public class ShowVistorImpl extends AbsShowVisotor {

	private String info = "";

	@Override
	public void visit(Manager manager) {
		info += this.getBaseInfo(manager) + this.getManagerInfo(manager) + "\t\n";
	}

	@Override
	public void visit(CommonEmployee commonEmployee) {
		info += this.getBaseInfo(commonEmployee) + this.getCommonInfo(commonEmployee) + "\t\n";

	}

	@Override
	public String report() {
		return info;
	}

	private String getManagerInfo(Manager manager) {
		String info = "业绩:" + manager.getPerformance() + "\t";
		return info;
	}

	private String getCommonInfo(CommonEmployee commonEmployee) {
		String info = "工作:" + commonEmployee.getJob() + "\t";
		return info;
	}

}
