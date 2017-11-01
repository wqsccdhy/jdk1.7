package design.pattern.adapter.definition;

public class TargetImpl implements Target{

	@Override
	public void request() {
		System.out.println("目标角色执行自己的方法...");
		
	}

}
