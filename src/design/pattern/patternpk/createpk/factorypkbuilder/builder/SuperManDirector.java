package design.pattern.patternpk.createpk.factorypkbuilder.builder;

public class SuperManDirector {

	private AbsSuperManBuilder chileBuilder = new ChildSuperManBuilder();

	private AbsSuperManBuilder adultBuilder = new AdultSuperManBuilder();

	public SuperMan getChildSuperMan() {
		return chileBuilder.builerSuperMan();
	}

	public SuperMan getAdultdSuperMan() {
		return adultBuilder.builerSuperMan();
	}

}
