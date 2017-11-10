package design.pattern.patternpk.createpk.factorypkbuilder.builder;

public class ChildSuperManBuilder extends AbsSuperManBuilder {

	@Override
	public SuperMan builerSuperMan() {
		superMan.setBody("小超人");
		superMan.setSpecialSymbol("小S标记");
		superMan.setSpecialTalent("会飞");
		return super.superMan;
	}

}
