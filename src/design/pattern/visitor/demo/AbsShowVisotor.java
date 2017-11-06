package design.pattern.visitor.demo;

public abstract class AbsShowVisotor implements IShowVisotor {

	@Override
	public String getBaseInfo(Employer employer) {
		String info = "姓名:" + employer.getName() + "\t";
		info = info + "性别:" + employer.getSex() + "\t";
		info = info + "薪水:" + employer.getSalarey() + "\t\t";
		return info;
	}

}
