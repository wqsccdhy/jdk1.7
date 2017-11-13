package design.pattern.patternpk.structure.decoratorpkadapter.decorator;

public class UglyDuckling implements ISwan{

	@Override
	public void fly() {
		System.out.println("丑小鸭不能飞...");
		
	}

	@Override
	public void cry() {
		System.out.println("丑小鸭cry...");
		
	}

	@Override
	public void dseAppaearance() {
		System.out.println("丑小鸭...dseAppaearance");
		
	}

}
