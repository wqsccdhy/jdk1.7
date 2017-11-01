package design.pattern.strategy.demo;

public class GivenGreenLight implements IStratety {

	@Override
	public void operate() {
		System.out.println("开绿灯...");
		
	}

}
