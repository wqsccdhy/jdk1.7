package design.pattern.mix.commandandresponsibility.util;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;
import java.util.List;

import com.google.common.collect.Lists;

import design.pattern.mix.commandandresponsibility.ICommandName;

/**
 * 根据父类获得子类
 * 
 * @author Administrator
 *
 */
public class ClassUtils {

	public static List<Class<?>> getSonClass(Class<?> fatherClass) {
		List<Class<?>> returnClassList = Lists.newArrayList();
		// 获取包名
		String packageName = fatherClass.getPackage().getName();

		// 活期去包中所有的类
		List<Class<?>> packClasses = getClasses(packageName);

		// 判断是否是子类
		for (Class<?> c : packClasses) {
			if (fatherClass.isAssignableFrom(c) && !fatherClass.equals(c)) {
				returnClassList.add(c);
			}
		}

		return returnClassList;
	}

	private static List<Class<?>> getClasses(String packageName) {

		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

		String path = packageName.replace('.', '/');

		Enumeration<URL> resources = null;

		try {
			resources = classLoader.getResources(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		List<File> dirs = Lists.newArrayList();

		while (resources.hasMoreElements()) {
			URL element = resources.nextElement();
			dirs.add(new File(element.getFile()));
		}

		List<Class<?>> classes = Lists.newArrayList();
		for (File filr : dirs) {
			List<Class<?>> list = findClasses(filr, packageName);
			classes.addAll(list);
		}

		return classes;
	}

	private static List<Class<?>> findClasses(File filr, String packageName) {
		List<Class<?>> classes = Lists.newArrayList();

		if (!filr.exists()) {
			return classes;
		}

		File[] files = filr.listFiles();
		for (File file : files) {
			if (file.isDirectory()) {
				assert !file.getName().contains(".");
				classes.addAll(findClasses(file, packageName + "." + file.getName()));
			} else if (file.getName().endsWith(".class")) {
				try {
					Class<?> forName = Class
							.forName(packageName + "." + file.getName().substring(0, file.getName().length() - 6));
					classes.add(forName);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		return classes;
	}

	public static void main(String[] args) {
		Class<?> fatherClass = ICommandName.class;
		List<Class<?>> sonClass = ClassUtils.getSonClass(fatherClass);
		for (Class<?> c : sonClass) {
			String name = c.getName();
			System.out.println(name);
		}
	}
}
