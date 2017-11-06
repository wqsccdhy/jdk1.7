package design.pattern.visitor.demo;

public interface IVistor {

	public void visit(Manager manager);
	
	public void visit(CommonEmployee commonEmployee);
	

}
