package serializable;

import serializable.demo.Person;
import serializable.util.SerializableHelper;
/**
 * 资料
 * https://www.cnblogs.com/xdp-gacl/p/3777987.html
 * @author Administrator
 *
 */
public class SerializableTest {

	public static void main(String[] args) {
		Person person = new Person();
		person.setAge(10);
		person.setSex(1);
		person.setName("测试");

		String filePath = "C:/file/serialize/";
		String fileName = person.getName();

		// SerializableHelper.serializeObj(person, filePath, fileName);

		Object object = SerializableHelper.deserializeObject(filePath, fileName);
		if (object != null) {
			Person personObj = (Person) object;
			int age = personObj.getAge();
			Integer sex = personObj.getSex();
			String name = personObj.getName();
			String addr = personObj.getAddr();
			System.out.println("age:" + age);
			System.out.println("sex" + sex);
			System.out.println("name:" + name);
			System.out.println("addr:" + addr);
		}
	}

}
