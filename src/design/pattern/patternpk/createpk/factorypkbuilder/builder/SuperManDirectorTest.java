package design.pattern.patternpk.createpk.factorypkbuilder.builder;

public class SuperManDirectorTest {

	public static void main(String[] args) {
		SuperManDirector director = new SuperManDirector();
		SuperMan childSuperMan = director.getChildSuperMan();
		String body = childSuperMan.getBody();
		System.out.println(body);

		SuperMan adultdSuperMan = director.getAdultdSuperMan();
		String body2 = adultdSuperMan.getBody();
		System.out.println(body2);

	}

}
