package design.pattern.visitor.demo;

public class Manager extends Employer {

	private String performance;

	@Override
	public void accept(IVistor vistor) {
		vistor.visit(this);
	}

	public String getPerformance() {
		return performance;
	}

	public void setPerformance(String performance) {
		this.performance = performance;
	}

	

}
