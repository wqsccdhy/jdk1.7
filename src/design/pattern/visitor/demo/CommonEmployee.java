package design.pattern.visitor.demo;

public class CommonEmployee extends Employer {

	private String job;

	@Override
	public void accept(IVistor vistor) {
		vistor.visit(this);

	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

}
