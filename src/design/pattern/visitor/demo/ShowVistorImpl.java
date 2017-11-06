package design.pattern.visitor.demo;

public class ShowVistorImpl implements IShowVisotor {

	private String info = "";

	@Override
	public void visit(Manager manager) {
		info += manager.getInfo() + "\t\n";
	}

	@Override
	public void visit(CommonEmployee commonEmployee) {
		info += commonEmployee.getInfo() + "\t\n";

	}

	@Override
	public String report() {
		return info;
	}

}
