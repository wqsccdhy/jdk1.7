import java.util.HashMap;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * Java中equals()和hashCode()有一个契约: 1. 如果两个对象相等的话，它们的hash code必须相等； 2.
 * 但如果两个对象的hash code相等的话，这两个对象不一定相等。
 * 
 * @author Administrator
 *
 */
public class Apple {
	private String color;

	public Apple(String color) {
		this.color = color;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder(17, 37).append(color).append(color.length()).toHashCode();
	}

	@Override
	public boolean equals(Object obj) {

		if (!(obj.getClass().equals(Apple.class))) {
			return false;
		}

		if (obj == this) {
			return true;
		}

		Apple apple = (Apple) obj;
		return new EqualsBuilder().append(this.color, apple.color).isEquals();
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public static void main(String[] args) {
		Apple a1 = new Apple("green");
		Apple a2 = new Apple("red");

		// hashMap stores apple type and its quantity
		HashMap<Apple, Integer> m = new HashMap<Apple, Integer>();
		m.put(a1, 10);
		m.put(a2, 20);

		Apple apple = new Apple("green");
		System.out.println(apple.equals(a1));
		System.out.println(m.get(apple));

	}
}