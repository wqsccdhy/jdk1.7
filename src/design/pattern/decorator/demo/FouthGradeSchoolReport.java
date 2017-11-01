package design.pattern.decorator.demo;

public class FouthGradeSchoolReport extends SchoolReport {

	@Override
	public void report() {
		System.out.println("我的成绩是90...");

	}

	@Override
	public void sign(String name) {
		System.out.println("家长签名:" + name);

	}

}
