package design.pattern.decorator.demo;

public class HighSchoolDecorator extends Decortor {

	public HighSchoolDecorator(SchoolReport sr) {
		super(sr);
	}

	@Override
	public void report() {
		super.report();
		this.reportHighScore();
	}

	private void reportHighScore() {
		System.out.println("最高分是100...");
	}

}
