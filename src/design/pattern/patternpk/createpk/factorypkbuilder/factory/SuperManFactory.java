package design.pattern.patternpk.createpk.factorypkbuilder.factory;

public class SuperManFactory {

	public static ISuperMan createSuperMan(Class<?> c) {
		ISuperMan superMan = null;
		try {
			superMan = (ISuperMan) Class.forName(c.getName()).newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return superMan;
	}
}
