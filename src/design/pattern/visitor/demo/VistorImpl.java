package design.pattern.visitor.demo;

public class VistorImpl implements IVistor {

	@Override
	public void visit(Employer employer) {
		String info = employer.getInfo();
		System.out.println(info);

	}

}
