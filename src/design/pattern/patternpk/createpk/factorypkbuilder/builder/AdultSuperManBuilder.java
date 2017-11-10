package design.pattern.patternpk.createpk.factorypkbuilder.builder;

public class AdultSuperManBuilder extends AbsSuperManBuilder {

	@Override
	public SuperMan builerSuperMan() {
		super.setBody("成年超人");
		super.setSpecialTalent("会飞");
		super.setSpecialSymbol("大S标记");
		return super.superMan;
	}

}
