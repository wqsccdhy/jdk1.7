package design.pattern.decorator.demo;

public class FatherTest {

	public static void main(String[] args) {

		SchoolReport fouthReport = new FouthGradeSchoolReport();

		fouthReport = new HighSchoolDecorator(fouthReport);

		fouthReport = new SortDecortor(fouthReport);

		fouthReport.report();
		fouthReport.sign("试试");

	}

}
