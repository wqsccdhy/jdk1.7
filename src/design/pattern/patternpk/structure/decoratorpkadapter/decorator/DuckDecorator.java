package design.pattern.patternpk.structure.decoratorpkadapter.decorator;

public abstract class DuckDecorator implements ISwan {

	private ISwan swan;

	public DuckDecorator(ISwan swan) {
		super();
		this.swan = swan;
	}

}
