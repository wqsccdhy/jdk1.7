package design.pattern.decorator.demo;

public class SortDecortor extends Decortor {

	public SortDecortor(SchoolReport sr) {
		super(sr);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void report() {
		super.report();
		this.sortReport();
	}
	
	private void sortReport(){
		System.out.println("我排第20名...");
	}

}
