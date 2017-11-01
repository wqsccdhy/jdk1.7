package design.pattern.decorator.demo;

public abstract class Decortor extends SchoolReport {

	private SchoolReport sr;

	public Decortor(SchoolReport sr) {
		this.sr = sr;
	}

	@Override
	public void report() {
		this.sr.report();

	}

	@Override
	public void sign(String name) {
		this.sr.sign(name);

	}

}
