package design.pattern.patternpk.createpk.factorypkbuilder.builder;

public abstract class AbsSuperManBuilder implements ISuperManBuilder {

	protected SuperMan superMan = new SuperMan();

	@Override
	public void setBody(String body) {
		this.superMan.setBody(body);

	}

	@Override
	public void setSpecialSymbol(String specialSymbol) {
		this.superMan.setSpecialSymbol(specialSymbol);
	}

	@Override
	public void setSpecialTalent(String specialTalent) {
		this.superMan.setSpecialTalent(specialTalent);
	}

	public abstract SuperMan builerSuperMan();

}
