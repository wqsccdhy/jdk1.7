package design.pattern.patternpk.createpk.factorypkbuilder.factory;

public class SuperManFactoryTest {

	public static void main(String[] args) {

		ISuperMan createSuperMan = SuperManFactory.createSuperMan(AudltSuperMan.class);
		createSuperMan.specialTalent();

		ISuperMan createSuperMan2 = SuperManFactory.createSuperMan(ChildSuperMan.class);
		createSuperMan2.specialTalent();

	}

}
