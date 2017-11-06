package design.pattern.visitor.demo;

import java.util.ArrayList;
import java.util.List;

public class VistorTest {

	public static void main(String[] args) {
		List<Employer> list = new ArrayList<Employer>();

		Manager manager1 = new Manager();
		manager1.setName("开发经理");
		manager1.setSex(1);
		manager1.setSalarey(9000);
		manager1.setPerformance("良好");

		Manager manager2 = new Manager();
		manager2.setName("销售经理");
		manager2.setSex(0);
		manager2.setSalarey(8000);
		manager2.setPerformance("一般");

		CommonEmployee commonEmployee1 = new CommonEmployee();
		commonEmployee1.setName("测试人员A");
		commonEmployee1.setSex(1);
		commonEmployee1.setSalarey(6000);
		commonEmployee1.setJob("测试人员");

		CommonEmployee commonEmployee2 = new CommonEmployee();
		commonEmployee2.setName("销售人员A");
		commonEmployee2.setSex(0);
		commonEmployee2.setSalarey(6000);
		commonEmployee2.setJob("销售人员");

		list.add(manager1);
		list.add(manager2);
		list.add(commonEmployee1);
		list.add(commonEmployee2);

		AbsShowVisotor showVistor = new ShowVistorImpl();
		ITotalVisitor totalVistor = new TotalVisitorImpl();
		for (Employer employer : list) {
			employer.accept(showVistor);
			employer.accept(totalVistor);
		}

		String report = showVistor.report();
		System.out.println(report);

		int allSalary = totalVistor.getAllSalary();
		System.out.println("工作总和为:" + allSalary);

	}

}
