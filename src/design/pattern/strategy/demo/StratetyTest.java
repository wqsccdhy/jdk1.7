package design.pattern.strategy.demo;

public class StratetyTest {

	public static void main(String[] args) {
		
		IStratety iStratety = new BackDoor();
		
		Context context = new Context(iStratety);
		context.operate();
		
		iStratety = new GivenGreenLight();
		context = new Context(iStratety);
		context.operate();
		
		iStratety = new BlockEnemy();
		context = new Context(iStratety);
		context.operate();

	}

}
